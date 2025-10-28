//Exemplo de IF, IF ELSE, ELSE

// 🔹 Declaração da classe principal chamada "Aluno"
public class Aluno {

    // 🔹 Atributos (características que cada aluno tem)
    private String nome; // guarda o nome do aluno
    private double nota; // guarda a nota do aluno

    // 🔹 Construtor (inicializa os atributos quando o objeto é criado)
    public Aluno(String nome, double nota) {
        this.nome = nome;  // "this" indica que é o atributo da classe
        this.nota = nota;
    }

    // 🔹 Método que usa estrutura condicional "if" para decidir a situação do aluno
    public void verificarAprovacao() {
        if (nota >= 7.0) {
            // Se nota for 7 ou mais → aprovado
            System.out.println(nome + " foi aprovado com nota " + nota);
        } else if (nota >= 5.0) {
            // Se nota for entre 5 e 6.9 → recuperação
            System.out.println(nome + " está de recuperação com nota " + nota);
        } else {
            // Se nota menor que 5 → reprovado
            System.out.println(nome + " foi reprovado com nota " + nota);
        }
    }
}