package devraul.com.exercicio05.teste;

/*
5 - Faça um algoritmo que leia o valor do salário mínimo e o valor do salário de um usuário, calcule quantos salários mínimos esse
    usuário ganha e imprima na tela o resultado. (Base para o Salário mínimo R$ 1.293,20).
 */

import devraul.com.exercicio05.dominio.*;

import java.util.Scanner;

public class TesteEx05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Funcionario[] funcionarios = {new Gerente("Joãozinho", 8000.00),
                                      new Desenvolvedor("Raul", 2900.00),
                                      new Faxineiro("Zezinho", 2200.00),
                                      new EngenheiroCivil("Betinho", 12000.00)};


        for(Funcionario funcionario : funcionarios){
            funcionario.calculaQuantidadeSalariosMinimos();
        }

        sc.close();
    }
}
