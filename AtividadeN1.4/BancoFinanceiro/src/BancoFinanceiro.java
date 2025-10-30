public class BancoFinanceiro implements BaseBanco {
    private String titular;
    private double saldo;

    public BancoFinanceiro(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            setSaldo(getSaldo() + valor);
            System.out.println("Depósito de R$ " + valor + " realizado com sucesso!");
        } else {
            System.out.println("Valor inválido para depósito!");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= getSaldo()) {
            setSaldo(getSaldo() - valor);
            System.out.println("Saque de R$" + valor + "realizado com sucesso!!!");
        } else {
            System.out.println("saldo insuficiente ou valor invalido");

        }
    }
    

}
