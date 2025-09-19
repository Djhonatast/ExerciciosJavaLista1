
import java.util.Scanner;

class Exercicio1 {
//imprimindo direto na tela
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double notafinal;
        System.out.print("Informe a sua nota final: ");
        notafinal = s.nextDouble();

        if (notafinal >= 6) {
            System.out.print("Parábens você foi aprovado!");
        } else if (notafinal >= 4) {
            System.out.print("Precisa fazer substutiva.");
        } else {
            System.out.print("Reprovado!");
        }
    }
    //exemplo com variavel auxiliar:
}
