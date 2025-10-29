
    public class Carro {
    private String marca;
    private String cor;
    private int litragem;
    private boolean ligado;
    private int consumo;

        public Carro(String marca, String cor, int litragem, boolean ligado, int consumo) {
            this.marca = marca;
            this.cor = cor;
            this.litragem = litragem;
            this.ligado = ligado;
            this.consumo = consumo;
        }

        public String getMarca() {
            return marca;
        }

        public void setMarca(String marca) {
            this.marca = marca;
        }

        public String getCor() {
            return cor;
        }

        public void setCor(String cor) {
            this.cor = cor;
        }

        public int getLitragem() {
            return litragem;
        }

        public void setLitragem(int litragem) {
            this.litragem = litragem;
        }

        public boolean isLigado() {
            return ligado;
        }

        public void setLigado(boolean ligado) {
            this.ligado = ligado;
        }

        public int getConsumo() {
            return consumo;
        }

        public void setConsumo(int consumo) {
            this.consumo = consumo;
        }

        public void andarParaFrente() {
        if (this.ligado == false) {
            System.out.println("Não é possivel andar com carro desligado");
        } else {
            System.out.println("O tanque esta com: " + this.litragem);
            System.out.println("Andando....vrum...vrummm...vruuuummmm");
            this.litragem = this.litragem - 2;
            System.out.println("O tanque esta com: " + this.litragem);
        }
    }

    public void ligando(){
        this.ligado = true;
        System.out.println("Carro ligou!");
    }

    public void desligado(){
        this.ligado = false;
        System.out.println("Carro não ligou!");
    }

    public void alterarConsumo(int novoConsumo){
        this.consumo = novoConsumo;
        System.out.println("Novo consumo do carro é:  " + this.consumo);
    }

    public void status(){
        System.out.println("O carro " + this.cor);
        if(this.ligado == false){
            System.out.println("O carro esta desligado");
        }
        else{
            System.out.println("O carro esta ligado");
        }
        System.out.println("Marca do carro " + this.marca);
    }

}
