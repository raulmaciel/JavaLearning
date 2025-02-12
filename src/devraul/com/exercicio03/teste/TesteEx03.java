package devraul.com.exercicio03.teste;

/*

Faça um algoritmo que leia dois valores inteiros A e B, se os valores de A e B forem iguais, deverá somar os dois valores,

caso contrário devera multiplicar A por B. Ao final de qualquer um dos cálculos deve-se atribuir o resultado a uma variável C e

imprimir seu valor na tela.

 */

import devraul.com.exercicio03.servico.Comparador;

import java.util.Scanner;

public class TesteEx03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite dois valores inteiros: ");
        int A = sc.nextInt();
        int B = sc.nextInt();

        Comparador.operadorAcomB(A, B);





        sc.close();
    }
}
