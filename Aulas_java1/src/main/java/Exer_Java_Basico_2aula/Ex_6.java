package Exer_Java_Basico_2aula;

/*6. Desenvolva um algoritmo em Java que leia um número inteiro e imprima o seu
antecessor e seu sucessor.*/

import java.util.Scanner;

public class Ex_6 {
    public static void main(String[] args) {
        Scanner insere = new Scanner(System.in);

        System.out.println("Insira um número: ");
        int numero = insere.nextInt();

        int antecessor = numero - 1;
        int sucessor = numero + 1;

        System.out.println("O antecessor de " + numero + " é " + antecessor + " e seu sucessor é " + sucessor + ".");
    }
}
