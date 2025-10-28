// Importa a classe Scanner para ler dados do usuário
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // Cria um objeto Scanner para entrada de dados

        // Cria um objeto ContaBancaria com titular "Daniel" e saldo inicial 1000
        ContaBancaria conta = new ContaBancaria("Daniel", 1000.0);

        int opcao = -1; // Inicializa variável de controle do loop com valor diferente de 0

        // Loop while: executa enquanto opcao for diferente de 0
        while(opcao != 0) {

            // Mostra o menu na tela
            System.out.println("\n=== MENU ===");
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Ver saldo");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt(); // Lê a opção digitada pelo usuário

            // Estrutura condicional para decidir qual ação executar
            if(opcao == 1) { // Caso escolha 1 (Depositar)
                System.out.print("Informe o valor para depósito: ");
                double valorDeposito = scanner.nextDouble(); // Lê valor do depósito
                conta.depositar(valorDeposito); // Chama método depositar

            } else if(opcao == 2) { // Caso escolha 2 (Sacar)
                System.out.print("Informe o valor para saque: ");
                double valorSaque = scanner.nextDouble(); // Lê valor do saque
                conta.sacar(valorSaque); // Chama método sacar

            } else if(opcao == 3) { // Caso escolha 3 (Ver saldo)
                conta.mostrarSaldo(); // Chama método mostrarSaldo

            } else if(opcao == 0) { // Caso escolha 0 (Sair)
                System.out.println("Saindo..."); // Mensagem de saída

            } else { // Caso escolha inválida
                System.out.println("Opção inválida!"); // Mensagem de erro
            }
        }

        scanner.close(); // Fecha o Scanner para liberar recursos
    }
}