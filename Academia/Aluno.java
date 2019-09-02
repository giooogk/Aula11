import java.util.ArrayList;

public class Aluno {
    private String nome;
    private String matricula;
    private ArrayList<String> exercicio;

    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setExercicio(String coisa) {
        exercicio.add(coisa);
    }
    
}

