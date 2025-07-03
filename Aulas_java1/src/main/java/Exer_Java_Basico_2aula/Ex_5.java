package Exer_Java_Basico_2aula;

/*5. Crie um algoritmo que leia o valor do salário mínimo e o valor do salário de um usuário,
calcule a quantidade de salários mínimos esse usuário ganha e imprima o resultado.
        (1SM=R$788,00)*/

import java.util.Scanner;

public class Ex_5 {

    public static void main(String[] args) {

        Scanner valor = new Scanner(System.in);

        System.out.println("Digite o valor do salário mínimo: R$");
        double salario_minimo = valor.nextDouble();

        System.out.println("Insira o valor do seu salário: " + "R$ ");
        double salario = valor.nextDouble();

        double resultado = salario / salario_minimo;
        System.out.println("Você recebe " + resultado + " salário(s) mínimo(s).");


    }
}

