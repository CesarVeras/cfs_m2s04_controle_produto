package entidades;

import java.util.Objects;

public class ProdutoImportado extends Produto {
    private float taxa;

    public ProdutoImportado(String nome, float preco, float taxa) {
        super(nome, preco);
        this.taxa = taxa;
    }

    @Override
    public float getPreco() {
        return super.getPreco() + getTaxa();
    }

    public float getTaxa() {
        return taxa;
    }

    public void setTaxa(float taxa) {
        this.taxa = taxa;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ProdutoImportado that = (ProdutoImportado) o;
        return Float.compare(that.taxa, taxa) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), taxa);
    }

    @Override
    public String toString() {
        return "ProdutoImportado{" +
                "nome='" + getNome() + '\'' +
                ", preço=" + getPreco() +
                ", taxa=" + taxa +
                "}\n";
    }
}
