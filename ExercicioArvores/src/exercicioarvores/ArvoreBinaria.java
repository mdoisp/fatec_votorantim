package exercicioarvores;

public class ArvoreBinaria {
    private NoBinario raiz;
    
    public ArvoreBinaria(Object info){
        raiz = new NoBinario(info, null, null);
    }

    public NoBinario getRaiz() {
        return raiz;
    }

    public void setRaiz(NoBinario raiz) {
        this.raiz = raiz;
    }
    
    public void imprimirPreOrdem(){
        imprimirPreOrdem(raiz);
    }
    
    private void imprimirPreOrdem(NoBinario no){
        System.out.println("No: "+ no.getInfo());
        if(no.getEsquerda() != null){
            imprimirPreOrdem(no.getEsquerda());
        }if(no.getDireita() != null){
            imprimirPreOrdem(no.getDireita());
        }
    }
    
    public void imprimirEmOrdem(){
        imprimirEmOrdem(raiz);
    }
    
    private void imprimirEmOrdem(NoBinario no){
        if(no.getEsquerda() != null){
            imprimirEmOrdem(no.getEsquerda());
        }
        System.out.println("No: "+ no.getInfo());
        if(no.getDireita() != null){
            imprimirEmOrdem(no.getDireita());
        }
    }
    
    public void imprimirPosOrdem(){
        imprimirPosOrdem(raiz);
    }
    
    private void imprimirPosOrdem(NoBinario no){
        if(no.getEsquerda() != null){
            imprimirPosOrdem(no.getEsquerda());
        }
        //System.out.println("No: "+ no.getInfo());
        if(no.getDireita() != null){
            imprimirPosOrdem(no.getDireita());
        }
        System.out.println("No: "+ no.getInfo());
    }
    
    public int buscar(int valor){
        return buscar(valor, raiz, 0);
    }
    
    private int buscar(int valor, NoBinario no, int profundidade){
        int resposta = -1;
        if((int)no.getInfo() == valor){
            return profundidade;
        }else{
            if(no.getEsquerda() != null){
                resposta = buscar(valor, no.getEsquerda(), profundidade++);
            }else if(no.getDireita() != null){
                resposta = buscar(valor, no.getDireita(), profundidade++);
            }
            return resposta;
        }
    }
    
    public void addNoOrdenado(int valor){
        addNoOrdenado(valor, raiz);
    }
    
    private void addNoOrdenado(int valor, NoBinario no){
        if (valor < (int)raiz.getInfo()){
            if(no.getEsquerda() == null){
                no.setEsquerda(new NoBinario(valor, null, null));
            }
            else{
                addNoOrdenado(valor, no.getEsquerda());
            }
        }else{
            if(no.getDireita() == null){
                no.setDireita(new NoBinario(valor, null, null));
            }else{
                addNoOrdenado(valor, no.getDireita());
            }
        }
    }
}
