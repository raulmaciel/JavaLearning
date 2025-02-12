package devraul.com.exercicio02.servico;

public class Comparador {
    public static void verificarParOuImpar(int num){
        if(num % 2 == 0){
            System.out.println("O número " + num + " é par!");
            return;
        }
        System.out.println("O número " + num + " é impar!");
    }

    public static void verificarPositivoOuNegativo(long num){
        if (num < 0){
            System.out.println("O número " + num + " é negativo!");
            return;
        }
        System.out.println("O número " + num + " é positivo!");
    }
}
