package devraul.com.exercicio10.teste;

import devraul.com.exercicio10.servico.Aluno;
import devraul.com.exercicio10.servico.CalculoMediaService;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TesteEx10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        CalculoMediaService calculoMediaService = new CalculoMediaService();

        System.out.println("-=-==-=-=-=-=-=--=");
        System.out.println("Cadastro Aluno");
        System.out.println("-=-==-=-=-=-=-=--=");
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Matricula: ");
        String matricula = sc.nextLine();

        System.out.println("-=-==-=-=-=-=-=--=");

        double n1 = lerNota(sc, "Nota 1: ");
        double n2 = lerNota(sc, "Nota 2: ");
        double n3 = lerNota(sc, "Nota 3: ");

        Aluno aluno = new Aluno(nome, matricula);
        double media = calculoMediaService.calculaMedia(n1, n2, n3);
        aluno.setMedia(media);

        System.out.println("-=-=-=-= Resultado -=-=-=-=");
        System.out.println(aluno);

    }

    private static double lerNota(Scanner sc, String mensagem) {
        while (true) {
            try {
                System.out.print(mensagem);
                return sc.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida! Digite um número válido.");
                sc.nextLine(); // Limpa buffer
            }
        }

    }
}
