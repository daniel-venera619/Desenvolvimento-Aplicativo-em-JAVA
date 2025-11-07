public class Main {
    public static void main(String[] args) {
        Pessoa p = new Pessoa("Daniel", 25, "Masculino");
        System.out.println(p);
        System.out.println(p.fazerAniversario());
        System.out.println(p);

        Visitante v = new Visitante("Ana", 25, "Feminino");
        System.out.println(v);
        System.out.println(v.fazerAniversario());
        System.out.println(v);
    }
}