public class MagicWord implements Magia {
    private String nome;
    private String classe;
    private String atributo;
    private String cla;
    private int nivel;
    private int mana;
    private String magia;
    private int vitoria;
    private int derrota;


    public MagicWord(String nome, String classe, String atributo, String cla, int nivel, int mana, String magia, int vitoria, int derrota) {
        this.nome = nome;
        this.classe = classe;
        this.atributo = atributo;
        this.cla = cla;
        this.nivel = nivel;
        this.mana = mana;
        this.magia = magia;
        this.vitoria = vitoria;
        this.derrota = derrota;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public String getAtributo() {
        return atributo;
    }

    public void setAtributo(String atributo) {
        this.atributo = atributo;
    }

    public String getCla() {
        return cla;
    }

    public void setCla(String cla) {
        this.cla = cla;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public String getMagia() {
        return magia;
    }

    public void setMagia(String magia) {
        this.magia = magia;
    }

    public int getVitoria() {
        return vitoria;
    }

    public void setVitoria(int vitoria) {
        this.vitoria = vitoria;
    }

    public int getDerrota() {
        return derrota;
    }

    public void setDerrota(int derrota) {
        this.derrota = derrota;
    }
    public void classe() {
        System.out.println("Classe do mago: " + classe);
    }

    public void atributo() {
        System.out.println("Atributo mágico principal: " + atributo);
    }

    public void cla() {
        System.out.println("Clã de origem: " + cla);
    }

    public void usarMagia() {
        System.out.println(nome + " usa " + magia + " (nível " + nivel + ", mana: " + mana + ")");
    }
}
