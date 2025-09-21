package Model;

public class TipoEmpresa {
    int id;
    String tipoEmpresa;

    public TipoEmpresa(int id, String tipoEmpresa) {
        this.id = id;
        this.tipoEmpresa = tipoEmpresa;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getTipoEmpresa() {
        return tipoEmpresa;
    }
    public void setTipoEmpresa(String tipoEmpresa) {
        this.tipoEmpresa = tipoEmpresa;
    } 
}
