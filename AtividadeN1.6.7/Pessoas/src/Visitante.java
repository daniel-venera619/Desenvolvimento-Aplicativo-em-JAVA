public class Visitante extends Pessoa {
     public  Visitante(String nome, int idade, String sexo){
         super (nome,idade,sexo);
     }
     public String toString(){
         return "Visitante: " + super.toString();
     }
}

