package quarta_aula;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class For5 {
    public static void main(String[] args) {

        int contador;
        int numeros;

        Scanner scanner = new Scanner(System.in);

        for (contador = 1; contador <= 10; contador++) {
            System.out.println("Digite um número: ");

            numeros = scanner.nextInt();

            if (numeros % 2 == 0) {
                System.out.println("O número é PAR " + numeros);
            } else {
                System.out.println("O número é ÍMPAR " + numeros);
            }
        }
    }
}