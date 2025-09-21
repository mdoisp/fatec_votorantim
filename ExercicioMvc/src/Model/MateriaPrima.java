package Model;
import java.util.List;
import java.util.ArrayList;

public class MateriaPrima {
    private String nome;
    private String descricao;
    private double valorCompra;
    private List impostos;
    
    public MateriaPrima(String nome, String descricao){
        this.nome = nome;
        this.descricao = descricao;
    }
    
    public MateriaPrima(String nome, String descricao, double valorCompra, String impostos){
        this.nome = nome;
        this.descricao = descricao;
        this.valorCompra = valorCompra;
        this.impostos = new ArrayList<>();
    }

    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getDescricao(){
        return this.descricao;
    }
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    
    public double valorCompra(){
        return this.valorCompra;
    }
    public void valorCompra(double valorCompra){
        this.valorCompra = valorCompra;
    }
    
    public List getImpostos(){
        return this.impostos;
    }
    public void setImpostos(List impostos){
        this.impostos = impostos;
    }
    
    public void addImposto(Impostos alt){
        impostos.add(alt);
    }
    public void removeImposto(Impostos alt){
        impostos.remove(alt);
    }
}
