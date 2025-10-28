import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // Cria Scanner para entrada de dados

        System.out.print("Quantos alunos deseja cadastrar? ");
        int quantidadeAlunos = scanner.nextInt(); // Lê quantidade de alunos

        System.out.print("Quantas disciplinas cada aluno possui? ");
        int disciplinas = scanner.nextInt();      // Lê quantidade de disciplinas

        System.out.print("Quantas avaliações por disciplina? ");
        int avaliacoes = scanner.nextInt();       // Lê quantidade de avaliações

        // Cria array para armazenar objetos Aluno
        Aluno[] alunos = new Aluno[quantidadeAlunos];

        // Loop para cadastrar cada aluno
        for(int i = 0; i < quantidadeAlunos; i++) {
            scanner.nextLine(); // Limpa buffer do Scanner

            System.out.print("Digite o nome do aluno " + (i+1) + ": ");
            String nome = scanner.nextLine();       // Lê nome do aluno

            alunos[i] = new Aluno(nome, disciplinas, avaliacoes); // Cria objeto Aluno

            // Loop para adicionar notas do aluno
            for(int j = 0; j < disciplinas; j++) {           // Percorre cada disciplina
                for(int k = 0; k < avaliacoes; k++) {       // Percorre cada avaliação
                    System.out.print("Digite a nota " + (k+1) + " da disciplina " + (j+1) + " do aluno " + nome + ": ");
                    double nota = scanner.nextDouble();     // Lê a nota
                    alunos[i].adicionarNota(j, k, nota);   // Adiciona nota na matriz do aluno
                }
            }
        }

        System.out.println("\n=== RESULTADOS ===");

        // Loop para exibir informações de todos os alunos
        for(int i = 0; i < quantidadeAlunos; i++) {
            alunos[i].mostrarInfo();            // Chama método para exibir info do aluno
            System.out.println("-------------------------"); // Separador visual
        }

        scanner.close(); // Fecha Scanner
    }
}