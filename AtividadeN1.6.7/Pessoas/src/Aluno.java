public class Aluno extends Pessoa {

    private String matricula;
    private String curso;

    public Aluno(String nome, int idade, String sexo, String matricula, String curso) {
           super(nome, idade, sexo);
           this.matricula = matricula;
           this.curso = curso;
        }

        public String pagarMensalidade() {
            return "Mensalidade do aluno " + getNome() + " foi paga.";
        }


        public String toString() {
        return "IDMatricula=" + matricula + " Esta no curso=" + curso + ": " + super.toString();
    }

}
