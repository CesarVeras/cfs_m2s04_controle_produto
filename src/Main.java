import entidades.Produto;
import entidades.ProdutoImportado;
import entidades.ProdutoUsado;
import utils.ParseStringToDate;

import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Main implements ParseStringToDate {

    static Scanner s = new Scanner(System.in);
    static ArrayList<Produto> produtos = new ArrayList<>();

    public static void main(String[] args) {

        boolean continuar = true;

        System.out.println("Registro de produtos.");
        while (continuar) {
            cadastrarProduto();

            System.out.println("Deseja cadastrar outro produto? (S/n)");
            String resposta = s.next();
            if (!resposta.equalsIgnoreCase("s"))
                continuar = false;
        }
        produtos.forEach(System.out::print);
    }

    public static void cadastrarProduto() {
        System.out.println("Comum, usado ou importado(c/u/i)? ");
        String tipo = s.next();
        Produto p;

        System.out.println("Nome do produto: ");
        String nome = s.next();

        System.out.println("Preço do produto: ");
        float preco = s.nextFloat();

        if (tipo.equalsIgnoreCase("c")) {
            p = new Produto(nome, preco);
            produtos.add(p);
        } else if (tipo.equalsIgnoreCase("u")) {
            System.out.println("Data de fabricação do produto: ");
            String data = s.next();
            Date dataFabricacao = ParseStringToDate.parseStringToDate(data);
            p = new ProdutoUsado(nome, preco, dataFabricacao);
            produtos.add(p);
        } else if (tipo.equalsIgnoreCase("i")) {
            System.out.println("Taxa do produto: ");
            float taxa = s.nextFloat();
            p = new ProdutoImportado(nome, preco, taxa);
            produtos.add(p);
        } else {
            System.out.println("Tipo de produto informado inválido.");
        }
    }
}