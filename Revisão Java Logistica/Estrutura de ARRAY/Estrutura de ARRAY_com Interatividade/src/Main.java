import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // Cria objeto Scanner para entrada de dados

        System.out.print("Quantos alunos deseja cadastrar? ");
        int quantidadeAlunos = scanner.nextInt(); // Lê quantidade de alunos

        System.out.print("Quantas notas cada aluno terá? ");
        int quantidadeNotas = scanner.nextInt(); // Lê quantidade de notas por aluno

        Aluno[] alunos = new Aluno[quantidadeAlunos]; // Cria array para armazenar os alunos

        // Loop para cadastrar cada aluno
        for(int i = 0; i < quantidadeAlunos; i++) {
            scanner.nextLine(); // Limpa buffer do scanner
            System.out.print("Digite o nome do aluno " + (i+1) + ": ");
            String nome = scanner.nextLine(); // Lê o nome do aluno

            alunos[i] = new Aluno(nome, quantidadeNotas); // Cria objeto Aluno

            // Loop para adicionar notas do aluno
            for(int j = 0; j < quantidadeNotas; j++) {
                System.out.print("Digite a nota " + (j+1) + " do aluno " + nome + ": ");
                double nota = scanner.nextDouble(); // Lê nota
                alunos[i].adicionarNota(j, nota);  // Adiciona nota no objeto
            }
        }

        System.out.println("\n=== RESULTADOS ===");

        // Loop para exibir informações de todos os alunos
        for(int i = 0; i < quantidadeAlunos; i++) {
            alunos[i].mostrarInfo(); // Chama método para exibir info do aluno
            System.out.println("-------------------------");
        }

        scanner.close(); // Fecha Scanner
    }
}