package devraul.com.exercicio10.servico;

public class CalculoMediaService implements CalcularMedia{
    @Override
    public double calculaMedia(double notaMensal, double notaTrabalho, double notaOficial) {
        return (notaMensal + notaTrabalho + notaOficial)/3;
    }
}
