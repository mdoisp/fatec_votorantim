package exerciciotp29_04;

public abstract class Pessoa {
    protected String nome;
    private int idade;
    private String genero;
    
    public Pessoa(String nome, String genero){
        this.nome = nome;
        this.genero = genero;
    }
    public Pessoa(String nome, int idade, String genero){
        this(nome, genero);
        this.idade = idade;
    }
    
    public abstract String getNome();
    
    public String getGenero(){
        return this.genero;
    }
    public int getIdade(){
        return this.idade;
    }
}
