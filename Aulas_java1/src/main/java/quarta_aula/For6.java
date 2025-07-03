package quarta_aula;

import java.util.Scanner;

public class For6 {
    public static void main(String[] args) {

        int n1;
        int numero;
        int par = 0;
        int impar = 0;

        Scanner entrada = new Scanner(System.in);

        for (n1 = 1; n1 <= 10; n1 ++){
            System.out.println("Entre com o " + n1 + "º número: ");
            numero = entrada.nextInt();

            if(numero %2 == 0){
                par ++;
            }else{
                impar ++;
            }

        }
        System.out.println("Você digitou " + par + " números pares e " + impar + " números ímpares!");

    }
}
