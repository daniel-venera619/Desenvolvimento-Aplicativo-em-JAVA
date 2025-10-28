// Definição da classe Aluno
public class Aluno {
    private String nome;        // Nome do aluno
    private double[][] notas;   // Matriz de notas: linhas = disciplinas, colunas = avaliações

    // Construtor da classe: cria aluno com nome, quantidade de disciplinas e avaliações
    public Aluno(String nome, int disciplinas, int avaliacoes) {
        this.nome = nome;                        // Inicializa o nome do aluno
        this.notas = new double[disciplinas][avaliacoes]; // Cria matriz de notas
    }

    // metodo para adicionar nota em posição específica da matriz
    public void adicionarNota(int disciplina, int avaliacao, double valor) {
        if(disciplina >= 0 && disciplina < notas.length && avaliacao >= 0 && avaliacao < notas[0].length) {
            notas[disciplina][avaliacao] = valor; // Adiciona nota na posição correta
        }
    }

    // metodo para calcular a média de todas as notas do aluno
    public double calcularMedia() {
        double soma = 0;           // Variável para soma das notas
        int totalNotas = 0;        // Contador de notas

        // Loop pelas disciplinas
        for(int i = 0; i < notas.length; i++) {
            // Loop pelas avaliações
            for(int j = 0; j < notas[i].length; j++) {
                soma += notas[i][j]; // Soma cada nota
                totalNotas++;         // Incrementa contador
            }
        }

        return soma / totalNotas;    // Calcula e retorna a média geral
    }

    // metodo para exibir informações do aluno
    public void mostrarInfo() {
        System.out.println("Aluno: " + nome); // Exibe nome

        // Loop para mostrar notas por disciplina
        for(int i = 0; i < notas.length; i++) {
            System.out.print("Disciplina " + (i+1) + ": "); // Exibe número da disciplina
            for(int j = 0; j < notas[i].length; j++) {
                System.out.print(notas[i][j] + " ");       // Exibe cada nota
            }
            System.out.println();                           // Quebra de linha após cada disciplina
        }

        System.out.println("Média geral: " + calcularMedia()); // Exibe média geral
    }
}