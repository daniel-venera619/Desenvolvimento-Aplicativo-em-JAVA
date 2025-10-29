public class Caminhao {

    private String modelo;
    private String fabricante;
    private int ano;
    private double potencia;
    private double peso;
    private String tipoDeCarga;


    public Caminhao(String modelo, String fabricante, int ano, double potencia, double peso, String tipoDeCarga) {
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.ano = ano;
        this.potencia = potencia;
        this.peso = peso;
        this.tipoDeCarga = tipoDeCarga;
    }

    public String getTipoDeCarga() {
        return tipoDeCarga;
    }

    public void setTipoDeCarga(String tipoDeCarga) {
        this.tipoDeCarga = tipoDeCarga;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void mostrarStatus(){
        System.out.println("Modelo: " + getModelo());
        System.out.println("Fabricante: " + getFabricante());
        System.out.println("Ano: " + getAno());
        System.out.println("Potencia: " + getPotencia());
        System.out.println("Peso: " + getPeso());
        System.out.println("Tipo de Carga: " + getTipoDeCarga());
    }

    public void carregar(String carga) {
        System.out.println("Carregando " + carga + " no caminhão " + modelo);
    }

    public void descarregar() {
        System.out.println("Descargando o caminhão " + modelo);
    }
}




