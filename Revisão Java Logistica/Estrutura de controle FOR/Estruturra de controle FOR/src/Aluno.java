// Definição da classe Aluno
public class Aluno {
    private String nome;       // Nome do aluno
    private double[] notas;    // Array com as notas do aluno

    // Construtor da classe
    public Aluno(String nome, double[] notas) {
        this.nome = nome;       // Inicializa o nome
        this.notas = notas;     // Inicializa o array de notas
    }

    // metodo para calcular a média das notas
    public double calcularMedia() {
        double soma = 0;                      // Variável para armazenar a soma das notas
        for(int i = 0; i < notas.length; i++) { // Loop para percorrer todas as notas
            soma += notas[i];                 // Soma cada nota ao total
        }
        return soma / notas.length;           // Retorna a média
    }

    // metodo para mostrar informações do aluno
    public void mostrarInfo() {
        System.out.println("Aluno: " + nome);
        System.out.print("Notas: ");
        for(int i = 0; i < notas.length; i++) { // Loop para mostrar cada nota
            System.out.print(notas[i] + " ");
        }
        System.out.println("\nMédia: " + calcularMedia());
    }
}