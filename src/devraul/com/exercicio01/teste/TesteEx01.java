package devraul.com.exercicio01.teste;

//Faça um algoritmo que leia os valores de A, B, C e em seguida imprima na tela a soma entre A e B é mostre se a soma é menor que C.

import devraul.com.exercicio01.servico.Comparador;

import java.util.Scanner;

public class TesteEx01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite 3 valores para A, B e C, respectivamente: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();


        Comparador.comparaSomaABcomC(a, b, c);


        sc.close();
    }
}
