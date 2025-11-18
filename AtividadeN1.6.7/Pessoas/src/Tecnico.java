public class Tecnico extends Aluno {

    private String registroProfissional;

    public Tecnico(String nome, int idade, String sexo,
                   String matricula, String curso, String registroProfissional) {

        super(nome, idade, sexo, matricula, curso);
        this.registroProfissional = registroProfissional;
    }

    public String praticar() {
        return "Técnico " + getNome() + " está realizando prática profissional.";
    }

    public String toString() {
        return "Registro Profissional é " + registroProfissional + ":" + super.toString();
    }
}