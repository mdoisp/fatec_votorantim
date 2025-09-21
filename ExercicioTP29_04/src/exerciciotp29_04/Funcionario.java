package exerciciotp29_04;

public class Funcionario extends Pessoa{
    
    public Funcionario(String nome, String genero) {
        super(nome, genero);
    }
    public Funcionario(String nome, int idade, String genero){
        super(nome, idade, genero);
    }

    @Override
    public String getNome() {
        if (super.getGenero().equals(Genero.MASCULINO.toString())){
            return "Sr. "+ super.nome;
        }else{
            return "Sra. "+ super.nome;
        }
    }
}
