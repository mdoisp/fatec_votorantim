package Model;

public class RamoEmpresa {
    int id;
    char secao;
    String descricao;

    public RamoEmpresa(int id, char secao, String descricao) {
        this.id = id;
        this.secao = secao;
        this.descricao = descricao;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public char getSecao() {
        return secao;
    }
    public void setSecao(char secao) {
        this.secao = secao;
    }

    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
