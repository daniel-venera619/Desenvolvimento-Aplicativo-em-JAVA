public class Batalha {
    private MagicWord mago1;
    private MagicWord mago2;

    public Batalha(MagicWord mago1, MagicWord mago2) {
        this.mago1 = mago1;
        this.mago2 = mago2;
    }

    public MagicWord getMago1() {
        return mago1;
    }

    public void setMago1(MagicWord mago1) {
        this.mago1 = mago1;
    }

    public MagicWord getMago2() {
        return mago2;
    }

    public void setMago2(MagicWord mago2) {
        this.mago2 = mago2;
    }

    public void batalha() {
        System.out.println(" Iniciando a batalha entre " + mago1.getNome() + " e " + mago2.getNome() + "!\n");

        // Critério simples: quem tem mais mana + nível vence
        int poderMago1 = mago1.getMana() + (mago1.getNivel() * 10);
        int poderMago2 = mago2.getMana() + (mago2.getNivel() * 10);

        System.out.println(mago1.getNome() + " tem poder total: " + poderMago1);
        System.out.println(mago2.getNome() + " tem poder total: " + poderMago2 + "\n");

        if (poderMago1 > poderMago2) {
            System.out.println(mago1.getNome() + " vence a batalha com a magia " + mago1.getMagia() + "!");
        } else if (poderMago2 > poderMago1) {
            System.out.println(mago2.getNome() + " vence a batalha com a magia " + mago2.getMagia() + "!");
        } else {
            System.out.println("Empate! Ambos os magos estão igualmente poderosos!");
        }
    }
}

