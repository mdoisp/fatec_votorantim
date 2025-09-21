package exerciciotp29_04;

public class Colegio extends Aluno {

    public Colegio(String nome, int idade, String genero) {
        super(nome, idade, genero);
    }

    @Override
    public String getNota() {
        return String.valueOf(super.nota);
    }
    
}
