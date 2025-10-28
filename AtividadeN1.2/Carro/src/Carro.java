
public class Carro {
    public String marca;
    public String cor;
    public int litragem;
    public boolean ligado;
    private int consumo;

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
