package domain;

public class Professor extends Pessoa{

    private int matricula;

    public Professor(String nome, String email, int matricula){
        super(nome,email);
        this.matricula = matricula;
    }

    public int getMatricula() {
        return matricula;
    }

    @Override
    public String entrarNaSala() {
        return super.entrarNaSala() + "Sou um professor";
    }
    public String entrarNaSala(String tratamento) {
        return String.format("Olá, meu nome é %s %s e meu e-mail é %s",tratamento, nome, email);
    }
}