// Definição da classe ContaBancaria
public class ContaBancaria {

    // Atributos privados da classe
    private String titular; // Nome do titular da conta
    private double saldo;   // Saldo atual da conta

    // Construtor da classe: inicializa os atributos quando o objeto é criado
    public ContaBancaria(String titular, double saldoInicial) {
        this.titular = titular;       // Define o nome do titular
        this.saldo = saldoInicial;    // Define o saldo inicial
    }

    // metodo para depositar dinheiro
    public void depositar(double valor) {
        saldo += valor; // Adiciona o valor ao saldo
        System.out.println("Depósito realizado: R$" + valor); // Mensagem de confirmação
    }

    // metodo para sacar dinheiro
    public void sacar(double valor) {
        if(valor <= saldo) { // Verifica se há saldo suficiente
            saldo -= valor;  // Subtrai o valor do saldo
            System.out.println("Saque realizado: R$" + valor); // Mensagem de sucesso
        } else {
            System.out.println("Saldo insuficiente!"); // Mensagem de erro
        }
    }

    // metodo para mostrar o saldo da conta
    public void mostrarSaldo() {
        System.out.println("Titular: " + titular + " | Saldo: R$" + saldo);
    }
}