package Model;

public class Tributacao {
    int id;
    String informacoes;

    public Tributacao(int id, String informacoes) {
        this.id = id;
        this.informacoes = informacoes;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return informacoes;
    }
    public void setDescricao(String informacoes) {
        this.informacoes = informacoes;
    }
}
