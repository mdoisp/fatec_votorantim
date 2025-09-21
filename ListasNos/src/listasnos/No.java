package listasnos;

public class No {
    Object info;
    No proximoNo;
    
    public No(Object info, No proximoNo){
        this.info = info;
        this.proximoNo = proximoNo;
    }

    public Object getInfo() {
        return info;
    }

    public void setInfo(Object info) {
        this.info = info;
    }

    public No getProximoNo() {
        return proximoNo;
    }

    public void setProximoNo(No proximoNo) {
        this.proximoNo = proximoNo;
    } 
}
