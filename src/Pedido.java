import java.util.Scanner;

public class Pedido {
    private Consumidor cliente;
    private Cardapio comanda;

    public Pedido(Consumidor cliente, Cardapio comanda) {
        this.cliente = cliente;
        this.comanda = comanda;
        this.cliente.setNumerodoPedido(this.cliente.getNumerodoPedido() + 1);
        this.comanda.setValordoProduto(this.comanda.getValordoProduto());
    }

    public Consumidor getCliente() {

        return this.cliente;
    }


    public void setCliente(Consumidor cliente) {
        this.cliente = cliente;
    }

    public Cardapio getComanda() {
        return this.comanda;
    }

    public void setComanda(Cardapio comanda) {
        this.comanda = comanda;
    }

    public String toString() {
        return "Pedido{cliente=" + this.cliente + ", comanda=" + this.comanda + "}";
    }

}