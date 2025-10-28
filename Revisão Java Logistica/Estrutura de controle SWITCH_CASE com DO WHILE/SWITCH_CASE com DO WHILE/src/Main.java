// Importa a classe Scanner para ler dados do usuário
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // Cria objeto Scanner para entrada de dados

        // Cria uma conta bancária com titular "Daniel" e saldo inicial 1000.0
        ContaBancaria conta = new ContaBancaria("Daniel", 1000.0);

        int opcao; // Variável que armazenará a opção escolhida pelo usuário

        // Loop do-while: executa o menu pelo menos uma vez e repete até o usuário digitar 0
        do {
            // Mostra o menu na tela
            System.out.println("\n=== MENU ===");
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Ver saldo");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt(); // Lê a opção digitada pelo usuário

            // Estrutura switch-case: executa ações diferentes conforme a opção
            switch(opcao) {
                case 1: // Caso o usuário escolha 1 (Depositar)
                    System.out.print("Informe o valor para depósito: ");
                    double valorDeposito = scanner.nextDouble(); // Lê valor do depósito
                    conta.depositar(valorDeposito); // Chama o método depositar da conta
                    break; // Encerra o case

                case 2: // Caso o usuário escolha 2 (Sacar)
                    System.out.print("Informe o valor para saque: ");
                    double valorSaque = scanner.nextDouble(); // Lê valor do saque
                    conta.sacar(valorSaque); // Chama o método sacar da conta
                    break;

                case 3: // Caso o usuário escolha 3 (Ver saldo)
                    conta.mostrarSaldo(); // Mostra saldo da conta
                    break;

                case 0: // Caso o usuário escolha 0 (Sair)
                    System.out.println("Saindo...");
                    break;

                default: // Caso o usuário digite uma opção inválida
                    System.out.println("Opção inválida!");
            }

        } while(opcao != 0); // Repete o menu enquanto a opção for diferente de 0

        scanner.close(); // Fecha o Scanner para liberar recursos
    }
}