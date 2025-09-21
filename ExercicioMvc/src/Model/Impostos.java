package Model;

public class Impostos {
    private String nome, descricao;
    private double percentual;
    
    public Impostos(String nome, String descricao, double percentual){
        this.nome = nome;
        this.descricao = descricao;
        this.percentual = percentual;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getDescricao(){
        return descricao;
    }
    public void setdescricao(String descricao){
        this.descricao = descricao;
    }
    
    public double getPercentual(){
        return percentual;
    }
    public void setPercentual(double percentual){
        this.percentual = percentual;
    }
    
    @Override
    public String toString(){
        return "Imposto: " + nome + "("+ descricao+") "
        + percentual*100 + "%";
    }
}
