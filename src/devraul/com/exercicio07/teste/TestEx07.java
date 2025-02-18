package devraul.com.exercicio07.teste;

import java.util.InputMismatchException;
import java.util.Scanner;

//Faça um algoritmo que leia dois valores booleanos (lógicos) e determine se ambos são VERDADEIRO ou FALSO.

public class TestEx07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite dois valores booleanos (lógicos): ");


        try {
            System.out.print("Valor A: ");
            boolean bValorA = sc.nextBoolean();
            System.out.print("Valor B: ");
            boolean bValorB = sc.nextBoolean();

            verificaValores(bValorA, bValorB);
        } catch (InputMismatchException e) {
            System.out.println("Valor digitado é inválido!");
        }finally {
            sc.nextLine();
        }
        sc.close();
    }

    public static void verificaValores(boolean a, boolean b){
        if (a==b){
            System.out.println("Ambos são: " + (a ? "VERDADEIRO." : "FALSO."));
        }else {
            System.out.println("Os valores são diferentes!");
        }
    }

}
