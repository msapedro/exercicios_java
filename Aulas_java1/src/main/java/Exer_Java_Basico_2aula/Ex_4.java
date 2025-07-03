package Exer_Java_Basico_2aula;

/*4. Escrever um algoritmo que lê: -
- a porcentagem do IPI a ser acrescido no valor das peças
- o código da peça 1, valor unitário da peça 1, quantidade de peças 1
- o código da peça 2, valor unitário da peça 2, quantidade de peças 2
O algoritmo deve calcular o valor total a ser pago e apresentar o resultado.
Fórmula : (valor1*quant1 + valor2*quant2)*(IPI/100 + 1) */

import java.util.Scanner;

public class Ex_4 {
    public static void main(String[] args) {

        Scanner valor = new Scanner(System.in);

        System.out.println("Digite a porcentagem de IPI: " + "     % ");
        float valor_ipi = valor.nextFloat();


        System.out.println("Insira o código da peça 1: " );
        int codigo1 = valor.nextInt();

        System.out.println("Insira o valor unitário da peça 1: " + "R$");
        float unitario1 = valor.nextInt();

        System.out.println("Insira a quantidade de peça 1: ");
        int quantidade1 = valor.nextInt();


        System.out.println("Insira o código da peça 2: " );
        int codigo2 = valor.nextInt();

        System.out.println("Insira o valor unitário da peça 2: " + "R$");
        float unitario2 = valor.nextInt();

        System.out.println("Insira a quantidade de peça 2: ");
        int quantidade2 = valor.nextInt();

        float preco1 = unitario1 * quantidade1;
        float preco2 = unitario2 * quantidade2;
        float soma_valor = preco1 + preco2;

        float calculo_ipi = (valor_ipi / 100) + 1;

        float resultado = soma_valor * calculo_ipi;

        System.out.println("O valor total a ser pago é: " + " R$" + resultado);
    }
}
