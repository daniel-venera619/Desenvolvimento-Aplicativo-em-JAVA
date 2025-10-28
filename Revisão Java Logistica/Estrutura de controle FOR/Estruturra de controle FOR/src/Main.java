public class Main {
    public static void main(String[] args) {

        // Criando array de alunos
        Aluno[] alunos = new Aluno[3]; // Array com 3 alunos

        // Inicializando cada aluno com nome e notas
        alunos[0] = new Aluno("Ana", new double[]{8.5, 7.0, 9.0});
        alunos[1] = new Aluno("Bruno", new double[]{6.0, 7.5, 8.0});
        alunos[2] = new Aluno("Carla", new double[]{9.0, 8.5, 10.0});

        // Loop para percorrer todos os alunos
        for(int i = 0; i < alunos.length; i++) {
            alunos[i].mostrarInfo(); // Chama o metodo para mostrar info de cada aluno
            System.out.println("-------------------------");
        }
    }
}