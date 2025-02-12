package devraul.com.exercicio02.teste;

//Faça um algoritmo para receber um número qualquer e imprimir na tela se o número é par ou ímpar, positivo ou negativo.

import devraul.com.exercicio02.servico.Comparador;

import java.util.Scanner;

public class TesteEx01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número para verificar se é par ou ímpar, positivo ou negativo: ");
        int num = sc.nextInt();

        Comparador.verificarParOuImpar(num);
        Comparador.verificarPositivoOuNegativo(num);

        sc.close();
    }
}
