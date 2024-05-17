package CrudJava;


public class Aluno extends Pessoa{
    String matricula;

    public Aluno(String nome, float altura, int idade, String cpf, String matricula) {
        super(nome, altura, idade, cpf);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
}
