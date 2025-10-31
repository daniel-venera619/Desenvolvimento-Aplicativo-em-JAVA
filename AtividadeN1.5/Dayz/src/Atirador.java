//Estruturação classe atirador
public class Atirador {
    private String nome;
    private int precisao;
    private int municao;
    private String arma;
    private int vitoria;
    private int derota;
    private int forcaArma;

    public Atirador(String nome, int precisao, int municao, String arma, int vitoria, int derota, int forcaArma) {
        this.nome = nome;
        this.precisao = precisao;
        this.municao = municao;
        this.arma = arma;
        this.vitoria = vitoria;
        this.derota = derota;
        this.forcaArma = forcaArma;
    }

    public int getForcaArma() {
        return forcaArma;
    }

    public void setForcaArma(int forcaArma) {
        this.forcaArma = forcaArma;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPrecisao() {
        return precisao;
    }

    public void setPrecisao(int precisao) {
        this.precisao = precisao;
    }

    public int getMunicao() {
        return municao;
    }

    public void setMunicao(int municao) {
        this.municao = municao;
    }

    public String getArma() {
        return arma;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }

    public int getVitoria() {
        return vitoria;
    }

    public void setVitoria(int vitoria) {
        this.vitoria = vitoria;
    }

    public int getDerota() {
        return derota;
    }

    public void setDerota(int derota) {
        this.derota = derota;
    }

}



