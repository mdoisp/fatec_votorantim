package Model;

import java.util.Date;

public class Questionario {
    private int id;
    public Date data;

    public Questionario(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }
    public void setData(Date data) {
        this.data = data;
    }
}
