
package primeira_aula;

public class ClasseCaneta {
// ----------------------------------- ATRIBUTO ---------------------------------------

    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    String marca;

// --------------------------  MÉTODO (FUNÇÃO) SEM RETORNO -----------------------------

    void rabiscar() {

        if (this.tampada == true) {
            System.out.println("Erro. A caneta está tampada.");
        } else {
            System.out.println("Estou rabiscando");
        }
    }

    void desenhar() {
        if (this.tampada == true) {
            System.out.println("A caneta está tampada. Destampe para continuar");
        } else {
            System.out.println("Está a desenhar");
        }
    }

    void tampar() {
        this.tampada = true;
    }

    void destampar() {
        this.tampada = false;
    }

//------------------------------------- ESTADOS ------------------------------------------

    void estado_atual(){
        System.out.println("Esta caneta é do modelo: " + this.modelo);
        System.out.println("Esta caneta tem a cor: " + this.cor);
        System.out.println("Esta caneta tem a ponta: " + this.ponta);
        System.out.println("Esta caneta está com a carga em: " + this.carga + "%");
        System.out.println("Esta caneta está tampada " + this.tampada);
    }
}

