public class Empada extends Salgado {
    
    private String sabor;

    @Override
    public void prepararMassa() {
        System.out.println("Misturando a massa e abrindo com rolo");
    }
    
    public void colocarnaTravessa(){
        System.out.println("Colocando em formas retangulares");
    }
            
    @Override
    public void rechear() {
        System.out.println("Recheando");
    }
    
    public void rechear (String nome){
        if (nome.equals("Lucas")){
            System.out.println("Pode caprichar no recheio");
        }
    }

    public void rechear (float preco){ // Polimorfismo de Sobrecarga
        if (preco == 0.50f){
            System.out.println("Pouco recheio");
        }  if (preco == 2.0f){
            System.out.println("Médio recheio");
        } else if (preco == 5.0f) {
            System.out.println("Muito recheio");
            
        }
        }
                       
    public void rechear (int recheio){
        if (recheio == 1){
            System.out.println("Recheio de Queijo");
        } if (recheio == 2){
            System.out.println("Recheio de Calabresa ");
        } else if (recheio == 3){
            System.out.println("Recheio Misto");
        }
    }

    @Override
    public void assar() {
        System.out.println("Assando no forno");
    }
    
    public void colocarpraEsfriar (){
        System.out.println("Colocar pra esfriar");
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }
    
}
