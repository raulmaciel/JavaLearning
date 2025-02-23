package devraul.com.exercicio09.servico;

import java.util.InputMismatchException;

public class CalcularIMC {
    public static void calculoIMC(double peso, double altura){
        double imc = peso / Math.pow(altura, 2);
        if(imc < 18.5){
            System.out.println("Você está abaixo do peso ideal!");
        }else if(imc >= 18.6 && imc <= 24.9){
            System.out.println("Você está no peso ideal!");
        } else if (imc >= 25.0 && imc <= 29.9) {
            System.out.println("Você está levemente acima do peso peso ideal!");
        } else if (imc >= 30 && imc <= 34.9) {
            System.out.println("Você está em Obesidade grau I !");
        }else if (imc >= 35 && imc <= 39.9){
            System.out.println("Você está em Obesidade grau II (severa)!");
        }else{
            System.out.println("Você está em Obesidade grau III (mórbida)");
        }
    }
}
