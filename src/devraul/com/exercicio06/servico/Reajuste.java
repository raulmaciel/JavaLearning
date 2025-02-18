package devraul.com.exercicio06.servico;

public class Reajuste {
    private static final double PORCENTAGEM_REAJUSTE = 0.05;



    public static double calcularReajuste(double valor){
        return valor * (1 + PORCENTAGEM_REAJUSTE);
    }
}
