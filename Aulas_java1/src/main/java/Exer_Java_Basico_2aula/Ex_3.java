package Exer_Java_Basico_2aula;

/*3. Informar um saldo e imprimir o saldo com reajuste de 1%*/

import java.util.Scanner;

public class Ex_3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o valor do saldo: ");
        double saldo = entrada.nextDouble();

        double reajuste = saldo * 0.01;
        double valor_reajustado = saldo + reajuste;

        System.out.println("O valor do saldo com o reajuste de 1% é de: R$" + valor_reajustado);
    }
}
