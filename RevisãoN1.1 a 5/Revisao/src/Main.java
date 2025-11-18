public class Main {
    public static void main(String[] args) {
        MagicWord mago1 = new MagicWord("Arcanus", "Feiticeiro", "Fogo", "Clã Dragão", 5, 100, "Bola de Fogo", 0, 0);
        MagicWord mago2 = new MagicWord("Frost", "Mago", "Gelo", "Clã do Norte", 4, 120, "Rajada Congelante", 0, 0);

        mago1.classe();
        mago1.atributo();
        mago1.cla();

        Batalha duelo = new Batalha(mago1, mago2);
        duelo.batalha();
    }
}