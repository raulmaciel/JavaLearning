package devraul.com.exercicio09.teste;

import devraul.com.exercicio09.model.Pessoa;
import devraul.com.exercicio09.servico.CalcularIMC;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
* 9 - Faça um algoritmo que calcule o IMC (Índice de Massa Corporal) de uma pessoa, leia o seu peso e sua altura e imprima na tela sua condição

de acordo com a tabela abaixo:

Fórmula do IMC = peso / (altura) ²

Tabela Condições IMC



 Abaixo de 18,5   | Abaixo do peso

 Entre 18,6 e 24,9 | Peso ideal (parabéns)

 Entre 25,0 e 29,9 | Levemente acima do peso

 Entre 30,0 e 34,9 | Obesidade grau I

 Entre 35,0 e 39,9 | Obesidade grau II (severa)

 Maior ou igual a 40 | Obesidade grau III (mórbida)
* */

public class TesteEx09 {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
            System.out.println("Olá, iremos fazer um cadastro agora!");
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
            System.out.print("Qual seu nome?: ");
            String nome = sc.nextLine();
            System.out.print("Qual sua idade?: ");
            int idade = sc.nextInt();
            System.out.print("Qual seu peso?: ");
            double peso = sc.nextDouble();
            System.out.print("Qual é a sua altura?: ");
            double altura = sc.nextDouble();

            Pessoa pessoa1 = new Pessoa(nome, idade, peso, altura);
            System.out.println(pessoa1);

            sc.nextLine();

            System.out.println("Deseja Calcular seu IMC? (S/N)");
            String resposta = sc.nextLine();

            while (resposta.toLowerCase().charAt(0) == 's') {
                CalcularIMC.calculoIMC(pessoa1.getPeso(), pessoa1.getAltura());

                System.out.println("Deseja continuar? (S/N)");
                resposta = sc.nextLine();
            }
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida!");
        }
    }
}
