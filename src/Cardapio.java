public class Cardapio {
    private String nomedoProduto;
    private float valordoProduto;

    public Cardapio(String nomedoProduto, float valordoProduto) {
        this.nomedoProduto = nomedoProduto;
        this.valordoProduto = valordoProduto;
    }

    public String getNomedoProduto() {
        return this.nomedoProduto;
    }

    public void setNomedoProduto(String nomedoProduto) {
        this.nomedoProduto = nomedoProduto;
    }

    public float getValordoProduto() {
        return this.valordoProduto;
    }

    public void setValordoProduto(float valordoProduto) {
        this.valordoProduto = valordoProduto;
    }

    public void fazerPedido() {
    }

    public void realizarPagamento() {
    }

    public String toString() {
        return "Cardapio{nomedoProduto=" + this.nomedoProduto + ", valordoProduto=" + this.valordoProduto + "}";
    }


}
