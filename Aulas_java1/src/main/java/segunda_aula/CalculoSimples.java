package segunda_aula;

import java.util.Scanner; // chamando a classe Scanner da biblioteca java

public class CalculoSimples {

    public static void main(String[] args){

        float numero1;
        float numero2;
        float soma;
        float subtracao;
        float divisao;
        float multi;

        Scanner entrada = new Scanner(System.in); // Instanciando a classe, dizendo ao sistema que as informações serão colocadas pelo usuário

        System.out.println("Entre com o primeiro número: ");
        numero1 = entrada.nextFloat(); // se o atributo for do tipo sting, vai ser igual a "nextLine()"

        System.out.println("Entre com o segundo número: ");
        numero2 = entrada.nextFloat();

        soma = numero1 + numero2;
        subtracao = numero1 - numero2;
        divisao = numero1 / numero2;
        multi = numero1 * numero2;

        System.out.println("O resultado da soma dos números é igual a " + soma);
        System.out.println("O resultado da subtração dos números é igual a " + subtracao);
        System.out.println("O resultado da divisão dos números é igual a " + divisao);
        System.out.println("O resultado da multiplicação dos números é igual a " + multi);
    }
}
