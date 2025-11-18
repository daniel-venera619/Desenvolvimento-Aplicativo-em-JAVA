public class ContaComum {
    protected int numero;
    protected double saldo;
    protected int tipo;

    public ContaComum(int numero, double saldo, int tipo){
        this.numero = numero;
        this.saldo = saldo;
        this.tipo = tipo;
    }

    public boolean sacar (double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            return true;
        }
        return false;
    }

    public void depositar (double valor){
        saldo += valor;
    }
    public void depositar(String valorTexto) {
        int valor = Integer.parseInt(valorTexto);
        saldo += valor;
    }
}



