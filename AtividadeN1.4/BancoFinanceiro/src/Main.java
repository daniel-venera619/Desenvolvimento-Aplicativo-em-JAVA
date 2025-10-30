public class Main {
    public static void main(String[] args) {
        BancoFinanceiro conta1 = new BancoFinanceiro("Daniel", 500);

        conta1.depositar(250);
        conta1.sacar(300);

    }
}