public class Professor extends Pessoa {

    private String especialidade;
    private double salario;

    public Professor(String nome, int idade, String sexo, String especialidade, double salario) {
        super(nome, idade, sexo);
        this.especialidade = especialidade;
        this.salario = salario;
    }
    public void receberAumento(double aumento) {
        this.salario += aumento;
    }
    public String toString() {
        return "Professor [especialidade= " + especialidade +
                ", salario=" + salario + "] -> " + super.toString();
    }
}

