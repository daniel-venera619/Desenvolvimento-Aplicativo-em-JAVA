public class Main {
    public static void main(String[] args){

        PFisica usuario1 = new PFisica("Daniel","Rua dos bobos","7070-7070","02406966669");
        Pjuridica usuario2 = new Pjuridica("Bar na Esquina","Rua dos bebados","2424-2424","09.346.601/0001-25");

        usuario1.gravar();
        usuario2.gravar();

        ContaComum conta1 = new ContaComum(1,500,24);
        conta1.depositar(1500);
        conta1.depositar("250");
        conta1.sacar(650);

        ContaEspecial contaEsp1 = new ContaEspecial(2,100,3,800);
        contaEsp1.sacar(300);

        Historico h1 =new Historico(1,24);
        h1.gravar();
    }

}