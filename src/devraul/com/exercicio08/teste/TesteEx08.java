package devraul.com.exercicio08.teste;

import java.util.*;

/*
8 - Faça um algoritmo que leia três valores inteiros diferentes e imprima na
tela os valores em ordem decrescente.
*/
public class TesteEx08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arrayValores = new ArrayList<>();
        try {
            System.out.println("Digite três valores inteiros diferentes: ");
            for (int i = 0; i < 3; i++) {
                System.out.print("Valor " + (i+1)  + ": ");
                int valor = sc.nextInt();

                if(!arrayValores.contains(valor)){
                    arrayValores.add(valor);
                }else{
                    System.out.println("-=-=-\nO valor informado já existe! Os valores devem ser diferentes.\n-=-=-");
                    i--;
                }
            }

            Collections.sort(arrayValores);
            Collections.reverse(arrayValores);
            System.out.println("Valores em ordem decrescente: " + arrayValores);

        }catch (InputMismatchException e){
            System.out.println("Input inválido");
        }finally {
            sc.nextLine();
        }


        sc.close();
    }
}
