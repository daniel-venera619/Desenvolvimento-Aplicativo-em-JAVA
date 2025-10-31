public class Main {
    public static void main(String[] args) {

        Atirador sniper = new Atirador("Zé da Manga", 200, 20, "Anzio", 0,0, 1200);
        Atirador pistol = new Atirador("Zé", 150, 10, "Anzio", 0, 0, 1000);


        Tiroteio farol = new Tiroteio(sniper, pistol);

        farol.batalhar();


        System.out.println("Vitórias de " + farol.getA1().getNome() + ": " + farol.getA1().getVitoria());
        System.out.println("Vitórias de " + farol.getA2().getNome() + ": " + farol.getA2().getVitoria());

    }
}