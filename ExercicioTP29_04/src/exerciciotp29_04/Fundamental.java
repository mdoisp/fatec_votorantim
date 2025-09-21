package exerciciotp29_04;

public class Fundamental extends Aluno {
    
    public Fundamental(String nome, int idade, String genero){
        super(nome, idade, genero);
    }

    @Override
    public String getNota() {
        //Retorna notas de A a D, sendo A(10, 9) B(8, 7), C(6,5), D(<5)
        if (String.valueOf(super.nota).equals("10.0")||String.valueOf(super.nota).equals("9.0")){
            return "A";
        }else if(String.valueOf(super.nota).equals("8.0")||String.valueOf(super.nota).equals("7.0")){
            return "B";
        }else if(String.valueOf(super.nota).equals("6.0")||String.valueOf(super.nota).equals("5.0")){
            return "C";
        }else
            return "D";
    }
}
