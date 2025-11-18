public class Main {
    public static void main(String[] args) {

        System.out.println("======================================");
        System.out.println("           PESSOA");
        System.out.println("======================================");
        Pessoa p = new Pessoa(" Daniel",  25, " Masculino");
        System.out.println(p);
        System.out.println(p.fazerAniversario());
        System.out.println(p);

        System.out.println("\n======================================");
        System.out.println("           VISITANTE");
        System.out.println("======================================");
        Visitante v = new Visitante(" Ana",  30, " Feminino");
        System.out.println(v);

        System.out.println("\n======================================");
        System.out.println("          PROFESSOR");
        System.out.println("======================================");
        Professor prof = new Professor(" Carlos",  50, " Masculino",
                " Matemática",  5000);
        System.out.println(prof);
        prof.receberAumento(1000);
        System.out.println("Após aumento: " + prof);

        System.out.println("\n======================================");
        System.out.println("            ALUNO");
        System.out.println("======================================");
        Aluno a = new Aluno(" João",  20, " Masculino",
                " A123", " Engenharia");
        System.out.println(a);
        System.out.println(a.pagarMensalidade());

        System.out.println("\n======================================");
        System.out.println("            BOLSISTA");
        System.out.println("======================================");
        Bolsista b = new Bolsista(" Maria",  19, " Feminino",
                " B456", " Biologia",  50);
        System.out.println(b);
        System.out.println(b.renovarBolsa());
        System.out.println(b.pagarMensalidade());

        System.out.println("\n======================================");
        System.out.println("            TÉCNICO");
        System.out.println("======================================");
        Tecnico t = new Tecnico(" Roberto",  22, " Masculino",
                " T789", " Informática", " REG-2025");
        System.out.println(t);
        System.out.println(t.praticar());

    }
}