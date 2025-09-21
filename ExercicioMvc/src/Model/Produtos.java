package Model;
import java.util.List;
import java.util.ArrayList;

public class Produtos {
    private int id;
    private String nome;
    private String descricao;
    private List impostos;
    private List margem;
    private float valorVenda;

    public Produtos(int id, String nome){
        this.id = id;
        this.nome = nome;
    }
    
    public Produtos(int id, String nome, List impostos, float valorVenda){
        this(id, nome);
        this.impostos = new ArrayList<>();
        this.valorVenda = valorVenda;
    }

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getDescricao(){
        return descricao;
    }
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    public List getImpostos() {
        return impostos;
    }

    public void setImpostos(List impostos) {
        this.impostos = impostos;
    }

    public List getMargem() {
        return margem;
    }

    public void setMargem(List margem) {
        this.margem = margem;
    }

    public float getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(float valorVenda) {
        this.valorVenda = valorVenda;
    }
    
    public void addImposto(Impostos alt){
        impostos.add(alt);
    }
    public void removeImposto(Impostos alt){
        impostos.remove(alt);
    }
}
