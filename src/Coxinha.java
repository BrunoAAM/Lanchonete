public class Coxinha extends Salgado {
    
    private String Nome;
    private String sabor;
    private String tamanho;
        
    
    @Override
    public void prepararMassa() {
        System.out.println("Cozinhando Massa");
    }

    public void modelandoaMassa(){
        System.out.println("Modelando a massa em formato de coxinha");
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
        System.out.println("Assar com oléo");
    }

    
    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    
  
    
}
