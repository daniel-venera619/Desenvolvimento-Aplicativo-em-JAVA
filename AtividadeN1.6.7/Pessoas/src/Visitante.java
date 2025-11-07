public class Visitante extends Pessoa {
     public  Visitante(String nome, int idade, String sexo){
         super (nome,idade,sexo);
     }
     public String toSring(){
         return "Visitante -> " + super.toString();
     }
}

