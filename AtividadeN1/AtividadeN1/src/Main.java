public class Main {
    public static void main(String[] args) {

        // instanciar o objeto pela classe
        // exemplo:
        //NomeClasse batatinha = new NomeClasse();
        //batatinha.

        Carro cruze = new Carro();

        cruze.marca = "Chevroleti";
        cruze.cor = "Branco";
        cruze.litragem = 100;

        cruze.status();
        cruze.ligando();
        cruze.andarParaFrente();

    }
}