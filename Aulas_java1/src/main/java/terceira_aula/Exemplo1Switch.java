package terceira_aula;

import java.util.Scanner;

public class Exemplo1Switch {

        public static void main(String[] args) {
            int DiaSemana;
            String NomeDia;

            Scanner numero = new Scanner(System.in);

            System.out.println("Digite um dia da semana em número: ");
            DiaSemana = numero.nextInt();

            switch(DiaSemana){
                case 1: NomeDia = "Domingo"; break;
                case 2: NomeDia = "Segunda"; break;
                case 3: NomeDia = "Terça"; break;
                case 4: NomeDia = "Quarta"; break;
                case 5: NomeDia = "Quinta"; break;
                case 6: NomeDia = "Sexta"; break;
                case 7: NomeDia = "Sábado"; break;
                default: NomeDia = "Dia inválido";
            }
            System.out.println(NomeDia);
        }
}
