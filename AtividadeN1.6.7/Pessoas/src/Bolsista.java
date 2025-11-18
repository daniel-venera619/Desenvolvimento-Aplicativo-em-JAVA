public class Bolsista extends Aluno {

    private double bolsa;

    public Bolsista(String nome, int idade, String sexo,
                    String matricula, String curso, double bolsa) {

        super(nome, idade, sexo, matricula, curso);
        this.bolsa = bolsa;
    }

    public String renovarBolsa() {
        return "Bolsa de " + getNome() + " renovada com sucesso.";
    }

    public String pagarMensalidade() {
        return "Mensalidade do bolsista " + getNome() +
                " foi paga com desconto de " + bolsa + "%.";
    }

    public String toString() {
        return "Bolsa de " + bolsa + "% : " + super.toString();
    }
}