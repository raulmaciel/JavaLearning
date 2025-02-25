package devraul.com.exercicio10.servico;

public class Aluno{
    private String nome;
    private String matricula;
    private double media;

    public Aluno(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    @Override
    public String toString() {
        return String.format("Aluno: %s | Matrícula: %s | Média: %.2f", nome, matricula, media);
    }

}
