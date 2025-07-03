package segunda_aula;

import java.util.Scanner;

public class Media {

    public static void main(String[] args){

        float nota1;
        float nota2;
        float nota3;
        float nota4;
        float media;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira neste campo a nota do 1o bimestre: ");
        nota1 = entrada.nextFloat();

        System.out.println("Insira neste campo a nota do 2o bimestre: ");
        nota2 = entrada.nextFloat();

        System.out.println("Insira neste campo a nota do 3o bimestre: ");
        nota3 = entrada.nextFloat();

        System.out.println("Insira neste campo a nota do 4o bimestre: ");
        nota4 = entrada.nextFloat();

        media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.println("Sua média é " + media);

        if(media >=6){
            System.out.println("Você foi aprovado(a)");
        }else if(media >=5){
            System.out.println("Você está de recuperação");
        }else{
            System.out.println("Você foi reprovado(a)");
        }
    }
}
