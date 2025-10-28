// Definição da classe ContaBancaria
public class ContaBancaria {

    private String titular; // Nome do titular da conta
    private double saldo;   // Saldo da conta

    // Construtor da classe: chamado ao criar um objeto da classe
    public ContaBancaria(String titular, double saldoInicial) {
        this.titular = titular;    // Inicializa o atributo titular
        this.saldo = saldoInicial; // Inicializa o atributo saldo
    }

    // metodo para depositar dinheiro na conta
    public void depositar(double valor) {
        saldo += valor; // Soma o valor depositado ao saldo
        System.out.println("Depósito realizado: R$" + valor); // Mostra mensagem
    }

    // metodo para sacar dinheiro da conta
    public void sacar(double valor) {
        if(valor <= saldo) { // Verifica se há saldo suficiente
            saldo -= valor;  // Subtrai o valor do saldo
            System.out.println("Saque realizado: R$" + valor); // Mensagem de sucesso
        } else {
            System.out.println("Saldo insuficiente!"); // Mensagem de erro
        }
    }

    // metodo para mostrar o saldo e titular da conta
    public void mostrarSaldo() {
        System.out.println("Titular: " + titular + " | Saldo: R$" + saldo); // Exibe informações
    }
}