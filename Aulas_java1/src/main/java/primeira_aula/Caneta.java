package primeira_aula;

import org.w3c.dom.ls.LSOutput;

public class Caneta {

    public static void main(String[] args) {

        ClasseCaneta caneta1 = new ClasseCaneta();
        caneta1.modelo = "esferográfica";
        caneta1.cor = "preta";
        caneta1.ponta = 0.5f;
        caneta1.carga = 70;
        //caneta1.tampada = true;

        caneta1.destampar();
        caneta1.estado_atual();
        caneta1.desenhar();


        ClasseCaneta caneta2 = new ClasseCaneta();
        caneta2.modelo = "histrográfica";
        caneta2.cor = "azul";
        caneta2.ponta = 0.1f;
        caneta2.carga = 100;

        caneta2.tampar();
        caneta2.estado_atual();
        caneta2.desenhar();

    }
}

// System.out.println("Testando uma classe principal!!!");
// System.out.println("ESTOU APENDENDO JAVA!!"); //o system.out.print serve para deicar um texto na tela, semelhante ao document.write. E o ln é para quebrar linha
