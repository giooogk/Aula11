import java.util.HashSet;

public class Professor extends Funcionario
{ 
    private String nome;
    private HashSet<Aluno> Alunos;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public HashSet<Aluno> getAlunos() {
        return Alunos;
    }

    public void setAlunos(Aluno e) {
        Alunos.add(e);
    }
  
}
