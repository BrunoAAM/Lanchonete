import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
public class PadariaPOO {
    public PadariaPOO() {
    }

    public static void main(String[] args) {
        ArrayList<Consumidor> cliente = new ArrayList<Consumidor>(); // Criação de ArrayList
        ArrayList<Cardapio> produto = new ArrayList<Cardapio>();
        ArrayList<Pedido> novoPedido = new ArrayList<Pedido>();

        boolean rodando = true;
        while (rodando) { // Sistema de interação com o usuário
            System.out.println("(1) Cadastrar Cliente");
            System.out.println("(2) Visualizar Clientes");
            System.out.println("(3) Cadastrar Produtos");
            System.out.println("(4) Realizar Pedido");
            System.out.println("(5) Realizar Pagamento");
            System.out.println("(6) Encerrar Sistema");
            Scanner texto = new Scanner(System.in);
            String Comanda;
            Comanda = texto.nextLine();
            switch (Comanda) {

                case "1": {
                    System.out.println("Digite seu nome");
                    String nome = texto.nextLine();
                    System.out.println("Digite seu telefone");
                    String telefone = texto.nextLine();
                    System.out.println("Digite seu endereço");
                    String endereço = texto.nextLine();
                    System.out.println("Digite seu CPF");
                    String CPF = texto.nextLine();
                    cliente.add(new Consumidor(0, 0.0F, nome, telefone, endereço, CPF));
                    break;

                }
                case "2": { // Usando a classe exception CadstroNaoRealizado
                    System.out.println("Verificação de Usuário");
                    System.out.println("Digite seu CPF");
                    String CPFcliente;
                    CPFcliente = texto.nextLine();
                    Consumidor cTemp = null;
                    for (int indice = 0; indice < cliente.size(); indice++) {
                        if (cliente.get(indice).getCpf().compareToIgnoreCase(CPFcliente) == 0) {
                            cTemp = cliente.get(indice); // Obtendo Cliente
                        }
                        System.out.println(cTemp);


                    }

                    break;
                }
                case "3": { // Usando tratamento de exceções TRY/CATCH
                    try {
                        System.out.println("Digite o nome do produto");
                        String nomeProduto = texto.nextLine();
                        System.out.println("Digite o preço do produto");
                        float preçoProduto = texto.nextFloat();
                        produto.add(new Cardapio(nomeProduto, preçoProduto));
                        System.out.println(produto);

                    } catch (InputMismatchException exception) {
                        System.out.println("Formato do número inválido!!!");

                    }

                    break;
                }
                case "4": {try { // Usando tratamento de exceções TRY/CATCH
                    System.out.println("Digite seu CPF");
                    String CPFcliente;
                    CPFcliente = texto.nextLine();
                    Consumidor cTemp = null;
                    for (int indice = 0; indice < cliente.size(); indice++) {
                        if (cliente.get(indice).getCpf().compareToIgnoreCase(CPFcliente) == 0) {
                            cTemp = cliente.get(indice); // Obtendo Cliente
                        }


                    }
                    System.out.println("Segue abaixo o cardápio");
                    for (int ind = 0; ind < produto.size(); ind++) {
                        System.out.println(produto.get(ind)); // Printando Cardápio
                    }

                    System.out.println("Digite o Produto que Deseja");
                    String produtoCompra;
                    produtoCompra = texto.nextLine();
                    Cardapio pTemp = null;
                    for (int indice1 = 0; indice1 < produto.size(); indice1++) {
                        if (produto.get(indice1).getNomedoProduto().compareToIgnoreCase(produtoCompra) == 0) {
                            pTemp = produto.get(indice1); // Obtendo Produto

                        }
                    }
                    novoPedido.add(new Pedido(cTemp, pTemp)); // Criando pedido
                    System.out.println(novoPedido);

                }catch (NullPointerException exception){
                    System.out.println("Cliente ou produto não cadastrado");
                }

                    break;
                }

                case "5":{
                    System.out.println("Digite seu CPF");
                    String CPFcliente1;
                    float valorConta = 0;
                    CPFcliente1 = texto.nextLine();
                    for (int i = 0; i < novoPedido.size(); i++){
                        if(novoPedido.get(i).getCliente().getCpf().compareToIgnoreCase(CPFcliente1) == 0){
                            valorConta = valorConta + novoPedido.get(i).getComanda().getValordoProduto();
                            System.out.println("Seus pedidos em aberto:" + novoPedido.get(i));

                        }
                    }       System.out.println("O valor do pedido é: " + valorConta);
                            break;
                }
                case "6": {
                    rodando = false;
                    break;
                }

            }

        }

    }
}





















