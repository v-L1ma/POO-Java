package domain;

public class Pessoa {

    protected String nome,email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Pessoa(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public String entrarNaSala(){
        return String.format("Olá, meu nome é %s e meu e-mail é %s", nome, email);
    }
}
