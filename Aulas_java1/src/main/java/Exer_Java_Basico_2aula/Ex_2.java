package Exer_Java_Basico_2aula;

/*2. Fazer um programa que imprima a média aritmética dos números 8,9 e 7. A média dos
números 4, 5 e 6. A soma das duas médias. A média das médias.*/

public class Ex_2 {

    public static void main(String[] args) {

        double media1 =  (8 + 9 + 7) / 3;
        double media2 = (4 + 5 + 6) / 3;
        double soma_media = media1 + media2;
        double media_media = soma_media / 2;

        System.out.println("A média de 8 + 9 + 7 é: " + media1);
        System.out.println("A média de 4 + 5 + 6 é: " + media2);
        System.out.println("A soma das duas médias é: " + soma_media);
        System.out.println("A média das duas médias é: " + media_media);

    }
}
