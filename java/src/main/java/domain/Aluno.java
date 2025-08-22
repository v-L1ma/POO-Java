package domain;

public class Aluno extends Pessoa{

    private int ra;

    public Aluno(String nome, String email, int ra){
        super(nome,email);
        this.ra = ra;
    }

    public int getRa() {
        return ra;
    }

    @Override
    public String entrarNaSala() {
        return super.entrarNaSala() + "Sou um aluno";
    }
    public String entrarNaSala(String tratamento) {
        return String.format("Olá, meu nome é %s %s e meu e-mail é %s ",tratamento, nome, email);
    }
}
