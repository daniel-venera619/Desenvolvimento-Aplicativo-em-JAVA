public class Tiroteio {
    private Atirador a1;
    private Atirador a2;

    public Tiroteio(Atirador a1, Atirador a2) {
        this.a1 = a1;
        this.a2 = a2;
    }

    public Atirador getA1() {
        return a1;
    }

    public void setA1(Atirador a1) {
        this.a1 = a1;
    }

    public Atirador getA2() {
        return a2;
    }

    public void setA2(Atirador a2) {
        this.a2 = a2;
    }

    public  void  batalhar(){
        if (a1.getForcaArma() > a2.getForcaArma()){
            a1.setVitoria(a1.getVitoria()+1);
            System.out.println(a1.getNome() + " venceu! total de vitorias: " + a1.getVitoria());
        }
        else if (a2.getForcaArma() > a1.getForcaArma()) {
            a2.setVitoria(a2.getVitoria() + 1);
            System.out.println(a2.getNome() + " venceu! total de vitorias: " + a2.getVitoria());
        } else {
            System.out.println("Empate! Nenhum atirador venceu.");
        }

        }
    }

