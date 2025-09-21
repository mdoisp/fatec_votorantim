package filacomlista;

import java.util.ArrayList;
import java.util.List;

public class FilaComLista {
    List fila = new ArrayList<>();
    public void adicionar(Integer item){
        if (item >= 65){
            fila.add(0, item);
        }else{
            fila.add(item);
        }
    }
    /*public Integer remover(){
        return (Integer)fila.remove(0);
    }*/
    public Object exibirInicio(){
        return (Integer)fila.get(0);
    }
    public int tamanho(){
        return fila.size();
    }
    public Object remover() {
        return (Integer)fila.remove(0);
    }
}
