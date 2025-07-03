package segunda_aula;

import java.util.Scanner;

public class ComparandoNumeros {

    public static void main(String[] args){

        float numero1;
        float numero2;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira o primeiro número: ");
        numero1 = entrada.nextFloat();

        System.out.println("Insira o segundo número: ");
        numero2 = entrada.nextFloat();

        if (numero1 > numero2){
            System.out.println("O maior número é " + numero1);
        }else if (numero2 > numero1){
            System.out.println("O maior número é " + numero2);
        }else{
            System.out.println("Os dois números são iguais");
        }
    }
}
