package listasnos;

public class ListaLigada {
    No refPrimeiroNo;
    No refUltimoNo;
    int tamanhoLista;
    
    public ListaLigada(){
        refPrimeiroNo = null;
        refUltimoNo = null;
    }
    public void add(Object elemento){
        No aux = new No(elemento, refPrimeiroNo);
        if (refPrimeiroNo == null && refUltimoNo == null){
            refPrimeiroNo = refUltimoNo = aux;
            tamanhoLista++;
        }
        else{
        refUltimoNo.setProximoNo(aux);
            tamanhoLista++;
        }
    }
    public Object remover(int indice){
        
        return null;
    }
    public Object get(int indice){
        if (indice >= 0 && indice < tamanhoLista){
        percorreLista(indice);
        return percorreLista(indice).getInfo();
        }
        else{
            return "Erro, index maior que a lista";
        }
    }
    public String concatenaNos(){
        return "Lista ligada: ";
    }
    private No percorreLista(int indice) {
        No aux = refPrimeiroNo;
        for (int i=0; i < indice; i++){
            aux = aux.getProximoNo();
        }
        return aux;
    }
    public int getTamanhoLista(){
        return tamanhoLista;
    }
}
