package Model;

public class NotaFiscal {
    int id;
    String tipoEmpresa;

    public NotaFiscal(int id, String tipoEmpresa) {
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
