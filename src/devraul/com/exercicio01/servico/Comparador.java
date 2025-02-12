package devraul.com.exercicio01.servico;

public class Comparador {

    public static void comparaSomaABcomC(double a, double b, double c){
        double somaAB = a+b;
        if (somaAB > c){
            System.out.println("Soma A + B = " + somaAB + " , que é maior que C = " + c);
            return;
        }
        System.out.println("Soma A + B = " + somaAB + " , que é menor que C = " + c);
    }

}
