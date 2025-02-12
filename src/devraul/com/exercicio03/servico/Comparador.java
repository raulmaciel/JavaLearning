package devraul.com.exercicio03.servico;

public class Comparador {
    public static void operadorAcomB(int A, int B){
        int C;
        if(A == B){
            C = A+B;
            System.out.println("Os valores A e B são iguais a " + A + ", nesse caso, sua soma é igual a " + C);
            return;
        }
        C = A * B;
        System.out.println("O valor A é "+ A + " e o de B é " + B + ", nesse caso, a multiplicação entre eles é igual a " + C);
    }
}
