public class ContaEspecial extends ContaComum {
    private double limite;

    public ContaEspecial(int numero, double saldo, int tipo, double limite){
        super(numero,saldo,tipo);
        this.limite = limite;
    }

    @Override
    public boolean sacar(double valor) {
       if (super.sacar(valor)){
           return true;
       }
       if (valor <= saldo + limite){
           saldo -= valor;
           return true;
       }
       return false;
    }
}
