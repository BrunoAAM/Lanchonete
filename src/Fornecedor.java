public class Fornecedor {
    private String CNPJ;
    private String enderecoFornecedor;

    public Fornecedor(String CNPJ, String enderecoFornecedor) {
        this.CNPJ = CNPJ;
        this.enderecoFornecedor = enderecoFornecedor;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public String getEnderecoFornecedor() {
        return enderecoFornecedor;
    }

    @Override
    public String toString() {
        return "Fornecedor{" +
                "CNPJ='" + CNPJ + '\'' +
                ", enderecoFornecedor='" + enderecoFornecedor + '\'' +
                '}';
    }

    public void setEnderecoFornecedor(String enderecoFornecedor) {
        this.enderecoFornecedor = enderecoFornecedor;
    }

    public void realizaPedido(){
        System.out.println("Pedido Realizado");
    }
    public void cancelarPedido(){
        System.out.println("Pedido Cancelado");
    }
}
