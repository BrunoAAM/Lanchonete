public abstract class Pessoa {
    protected String nome;
    protected String telefone;
    protected String endereço;
    private String cpf;

    public Pessoa(String nome, String telefone, String endereço, String cpf) {
        this.nome = nome;
        this.telefone = telefone;
        this.endereço = endereço;
        this.cpf = cpf;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereço() {
        return this.endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String toString() {
        return "Pessoa{nome=" + this.nome + ", telefone=" + this.telefone + ", endereço=" + this.endereço + ", cpf=" + this.cpf + "}";
    }
}
