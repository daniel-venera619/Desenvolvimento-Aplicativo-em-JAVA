public class PFisica extends Pessoa {
    private  String cpf;

    public PFisica(String nome, String endereco, String telefone, String cpf){
        super(nome, endereco, telefone);
        this.cpf = cpf;
    }

    @Override
    public void gravar() {
        super.gravar();
        System.out.println("Gavando dados da pessoa fisica: " + nome + "/ CPF: " + cpf );
    }
}
