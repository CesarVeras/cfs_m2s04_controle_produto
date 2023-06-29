package entidades;

import java.util.Date;
import java.util.Objects;

public class ProdutoUsado extends Produto {
    private Date dataFabricacao;

    public ProdutoUsado(String nome, float preco, Date dataFabricacao) {
        super(nome, preco);
        this.dataFabricacao = dataFabricacao;
    }

    public Date getDataFabricacao() {
        return dataFabricacao;
    }

    public void setDataFabricacao(Date dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ProdutoUsado that = (ProdutoUsado) o;
        return Objects.equals(dataFabricacao, that.dataFabricacao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), dataFabricacao);
    }

    @Override
    public String toString() {
        return "ProdutoUsado{" +
                "nome='" + getNome() + '\'' +
                ", preço=" + getPreco() +
                ", dataFabricacao=" + dataFabricacao +
                "}\n";
    }
}
