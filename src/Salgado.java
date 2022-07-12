public abstract class Salgado {
    
    protected String tipo;
    protected float valor;
    protected String sabor;
    //metodos de salgado
   public abstract void prepararMassa(); // Polimorfismo de sobreposição
   public abstract void rechear();
   public abstract void assar();
   

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }
   
   
   
   
    
}
