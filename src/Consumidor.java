public class Consumidor extends Pessoa { // Uso de Herança de classes
    private int numerodoPedido = 0;
    private float totaldaConta = 0.0F;

    public Consumidor(int numerodoPedido, float totaldaConta, String nome, String telefone, String endereço, String cpf) {
        super(nome, telefone, endereço, cpf);
    }

    public int getNumerodoPedido() {
        return this.numerodoPedido;
    }

    public void setNumerodoPedido(int numerodoPedido) {
        this.numerodoPedido = numerodoPedido;
    }

    public float getTotaldaConta() {
        return this.totaldaConta;
    }

    public void setTotaldaConta(float totaldaConta) {
        this.totaldaConta = totaldaConta;
    }

    public String toString() {
        String var10000 = super.toString();
        return "Cliente{" + var10000 + "numerodoPedido=" + this.numerodoPedido + ", totaldaConta=" + this.totaldaConta + "}";
    }

    public void fazerPedido(String escolha) {
        if (escolha.equals("Lucas")) {
            System.out.println("Pode caprichar no recheio");
        }

    }

    public void fazerPedido(int pagamento) {
        if (pagamento == 1) {
            System.out.println("Dinheiro");
        }

        if (pagamento == 2) {
            System.out.println("Cartão de Crédito");
        } else if (pagamento == 3) {
            System.out.println("PIX");
        }

    }
       public void verificarCliente(String CPF){


       }
}
