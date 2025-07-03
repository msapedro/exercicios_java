    package quinta_aula;

    import java.util.Scanner;
    import java.util.Random;

    public class Conta {

        /* O atributo é o saldo */

        int numero_conta;
        String titular_conta;
        double saldo; // o double serve para valores maiores e quebrados, tipo dinheiro; o float é para quantidades maiores
        double valor_emprestimo;

        Scanner entrada = new Scanner(System.in);

        // Método construtor: é um método que, para que ele seja executado, precisa ter dados e informações nele
        // o método abaixo está fazendo referencia, ou seja, esta instanciando a Classe Conta, no início do código
        // para instanciar, precisa colocar o public

        public Conta(String nome_titular, double saldo_inicial){
            this.titular_conta = nome_titular;
            this.saldo = saldo_inicial;

            Random gerador_numero = new Random(); // gerador randômico de números
            numero_conta = gerador_numero.nextInt(1000); // limite de 1000 caracteres
        }

        public void VerSaldo(){

            System.out.println("O número da sua conta é: " + numero_conta);
            System.out.println("O titular da conta é: " + titular_conta);
            System.out.println("O saldo da sua conta é: " + saldo);
            System.out.println("O saldo da sua conta é: " + valor_emprestimo);
        }

        // dentro do parenteses esta criado um novo atributo chamado valor_saque, e faz referencia ao saldo

        public void Saque(double valor_saque){
            if (saldo >= valor_saque){
                saldo = saldo - valor_saque;
                System.out.println("O valor do saldo atual é: " + saldo);
            }else{
                System.out.println("Saldo insuficiente seu pobre lascado");
            }
        }

        public void Deposito(double valor_deposito){
            if (valor_deposito <= 0){
                System.out.println("Depósito inválido seu inutil. O valor é menor que R$0,00");
            }else{
                saldo = saldo + valor_deposito;
                System.out.println("Depósito concluído! Valor do saldo atual é: " + saldo + ". Tá portando ein");
            }
        }

        public void Emprestimo(double valor_emprestimo){
            if (this.saldo < 100){
                if (valor_emprestimo < 1000){
                    this.saldo += valor_emprestimo; // mesma coisa que saldo_conta = saldo_conta + valor_emprestimo
                    System.out.println("Empréstimo autorizado no valor de: " + "R$" + valor_emprestimo);
                }
                else{
                    System.out.println("Empréstimo negado. Valor superior a R$1.000,00");
                }
            }
            else{
                System.out.println("Empréstimo não autorizado. Seu saldo é maior que R$100,00");
            }
        }

        public void Exibir_menu(){
            System.out.println("Bem-vindo ao XYZ");
            System.out.println("Escolha a sua opção: ");
            System.out.println("1- Ver saldo");
            System.out.println("2- Saque");
            System.out.println("3- Depósito");
            System.out.println("4- Empréstimo");
            System.out.println("5- Finalizar operação");
        }

        public void Escolher_funcao(int opcao){
            double saque;
            double deposito;
            double emprestimo;

            switch (opcao) {
                case 1:
                    VerSaldo();
                    break;
                case 2:
                    System.out.println("Digite com o valor a ser sacado: R$");
                    saque = entrada.nextDouble();
                    Saque(saque);
                    break;
                case 3:
                    System.out.println("Digite com o valor a ser depositado: R$");
                    deposito = entrada.nextDouble();
                    Deposito(deposito);
                    break;
                case 4:
                    System.out.println("Digite o valor do empréstimo: R$");
                    emprestimo = entrada.nextDouble();
                    Emprestimo(emprestimo);
                    break;
                case 5:
                    System.out.println("Operação finalizada");
                    ;
                    break;

                default:
                    System.out.println("Opção inválida");
            }
        }

        public void Iniciar() {
            int opcao;
            do {
                Exibir_menu();
                opcao = entrada.nextInt();
                Escolher_funcao(opcao); //método construtor
            } while (opcao != 5); // ele vai repetir a funçao sempre que for diferente de 4
        }
    }