//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Caminhao caminhao1 = new Caminhao("FH16", "Volvo", 2022, 750, 8000, "Carga Pesada");

        caminhao1.mostrarStatus();
        caminhao1.carregar("areia");
        caminhao1.descarregar();

        Caminhao caminhao2 = new Caminhao("R450","Scania ",2020,450, 1000,"Carga Leve");
        caminhao2.mostrarStatus();
        caminhao2.carregar("Pena");
        caminhao2.descarregar();
    }

}

