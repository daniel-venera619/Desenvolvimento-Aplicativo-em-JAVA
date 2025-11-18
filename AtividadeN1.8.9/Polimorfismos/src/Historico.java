public class Historico {
    private int numeroConta;
    private int tipoConta;

    public Historico(int numeroConta, int tipoConta){
        this.numeroConta = numeroConta;
        this.tipoConta = tipoConta;
    }
    public void  gravar(){
        System.out.println("Registro historico da conta: " + numeroConta + "/ tipo: " + tipoConta);
    }
}
