public class Pjuridica extends Pessoa {
    private String cnpj;

    public Pjuridica(String nome, String endereco, String telefone, String cnpj){
        super(nome, endereco,telefone);
        this.cnpj = cnpj;
    }

    @Override
    public void gravar() {
        super.gravar();
        System.out.println("Gravar dados pessoa juridica: " + nome + "/ CNPJ:  " + cnpj);
    }
}
