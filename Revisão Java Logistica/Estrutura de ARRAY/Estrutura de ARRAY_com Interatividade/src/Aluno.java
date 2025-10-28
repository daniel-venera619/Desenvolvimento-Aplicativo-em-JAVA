// Definição da classe Aluno
public class Aluno {
    private String nome;      // Nome do aluno
    private double[] notas;   // Array de notas do aluno

    // Construtor da classe
    public Aluno(String nome, int quantidadeNotas) {
        this.nome = nome;                 // Inicializa o nome
        this.notas = new double[quantidadeNotas]; // Cria array de notas com o tamanho informado
    }

    // metodo para adicionar notas digitadas pelo usuário
    public void adicionarNota(int indice, double valor) {
        if(indice >= 0 && indice < notas.length) { // Verifica se o índice é válido
            notas[indice] = valor;                 // Adiciona a nota no array
        }
    }

    // metodo para calcular a média das notas
    public double calcularMedia() {
        double soma = 0;
        for(int i = 0; i < notas.length; i++) {
            soma += notas[i]; // Soma todas as notas
        }
        return soma / notas.length; // Retorna a média
    }

    // metodo para exibir informações do aluno
    public void mostrarInfo() {
        System.out.println("Aluno: " + nome);
        System.out.print("Notas: ");
        for(int i = 0; i < notas.length; i++) {
            System.out.print(notas[i] + " "); // Exibe cada nota
        }
        System.out.println("\nMédia: " + calcularMedia());
    }
}