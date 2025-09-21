package Model;

public class AbrirEmpresa {
    int id;
    String informacoes;

    public AbrirEmpresa(int id, String informacoes) {
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
