

    // 🔹 Método principal (ponto de entrada do programa)
    public static void main(String[] args) {
        // Criação de 3 objetos do tipo Aluno
        Aluno aluno1 = new Aluno("Maria", 8.5);
        Aluno aluno2 = new Aluno("João", 6.0);
        Aluno aluno3 = new Aluno("Ana", 4.2);

        // Chamada do método "verificarAprovacao" para cada aluno
        aluno1.verificarAprovacao();
        aluno2.verificarAprovacao();
        aluno3.verificarAprovacao();
    }