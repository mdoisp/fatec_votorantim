package Model;

public class EscolherContabilidade {
    int id;
    String informacoes;

    public EscolherContabilidade(int id, String informacoes) {
        this.id = id;
        this.informacoes = informacoes;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getInformacoes() {
        return informacoes;
    }
    public void setInformacoes(String informacoes) {
        this.informacoes = informacoes;
    }
}
