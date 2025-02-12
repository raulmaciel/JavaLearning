package devraul.com.exercicio04.teste;

//4 - Faça um algoritmo que receba um número inteiro e imprima na tela o seu antecessor e o seu sucessor.

import devraul.com.exercicio04.servico.Comparador;

import java.util.Scanner;

public class TesteEx04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número para descobrir seu antecessor e seu sucessor: ");
        int num = sc.nextInt();

        Comparador.verificaAntecessorESucessor(num);
        sc.close();
    }
}
