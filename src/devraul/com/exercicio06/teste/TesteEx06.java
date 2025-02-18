package devraul.com.exercicio06.teste;

import devraul.com.exercicio06.servico.Reajuste;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TesteEx06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um valor para ser reajustado: ");
        try {
            double valor = sc.nextDouble();
            System.out.printf("Valor com reajuste: %.2f", Reajuste.calcularReajuste(valor));
        }catch (InputMismatchException e){
            System.out.println("O valor digitado não está no formato válido");
            sc.nextLine();
        }


        sc.close();
    }
}
