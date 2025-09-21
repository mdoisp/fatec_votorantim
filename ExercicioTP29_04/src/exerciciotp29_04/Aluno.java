package exerciciotp29_04;

public abstract class Aluno extends Pessoa {
    protected float nota;
    
    public Aluno(String nome, int idade, String genero){
        super(nome, idade, genero);
    }

    @Override
    public String getNome() {
        return super.nome;
    }
    
    public abstract String getNota(); 
    
    public void setNota(float nota){
        this.nota = nota;
    }
}
