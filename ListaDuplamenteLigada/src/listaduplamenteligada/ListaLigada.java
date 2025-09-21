package listaduplamenteligada;


public class ListaLigada {
    
    private int qtdNos ;
    No primeiroNo;
    No ultimoNo;
    
    public ListaLigada(){
        qtdNos=0;
        primeiroNo=null;
        ultimoNo=null;
    }
    public ListaLigada(Object elemento){
        this();
        adicionar(elemento);
    }
    
    
    public void adicionar(Object elemento){
        No novoNo;
        // Se a lista está vazia inicializa a lista
        if(primeiroNo == null && ultimoNo == null && qtdNos==0){
            //Adicio a primeira posição
            novoNo=new No(elemento,null);
            primeiroNo= ultimoNo= novoNo;
            qtdNos=1;
        }
        else{
            // Lista já está instaciada adiciona na ultima posição
            novoNo=new No(elemento,null);
            ultimoNo.setProximoNo(novoNo);
            ultimoNo=novoNo;
            qtdNos++;
        }
    }
    
    
    public void adicionar(Object elemento,int posicao){
        No novoNo;
        
        if (posicao>=0){
            if(qtdNos==0 || posicao >= qtdNos ){
                adicionar(elemento);
            }  
            else if(posicao==0){
                // Adiciona NÓ no inicio da Lista
                novoNo=new No(elemento,primeiroNo);
                primeiroNo=novoNo;
                qtdNos++;
            }
            else{
                //Percorre a lista até encontrar a posição desejada
                No noAnterior=percorreLista(posicao-1);
                novoNo=new No(elemento,noAnterior.getProximoNo());
                noAnterior.setProximoNo(novoNo);
                qtdNos++;
            }
        }
    }
    public void adicionarOrdenacao(int valor, TipoOrdenacao tipo){
            
            
            if(tipo.equals(TipoOrdenacao.CRESCENTE)){
               //Add na lista de forma ordenada crescente
               
            }
            else{
                //Add na lista de forma ordenada decrescente
                    
            }
            
            
                 
    }
    public Object getLista(int posicao){
        return percorreLista(posicao).getInfo();
    }
    
    public void remover(int posicao){
        
        try{
            if(posicao==0){
                //remove o primeiro item da lista

                if (qtdNos==1){
                    // O ultimo No é igual o primeiro
                    primeiroNo=null;
                    ultimoNo=null;
                }
                else{
                    primeiroNo= primeiroNo.getProximoNo();
                }
                qtdNos--;
            }
            else if(posicao<qtdNos){
                No aux=percorreLista(posicao-1);
                aux.setProximoNo(aux.getProximoNo().getProximoNo());
                if(qtdNos==1){
                    ultimoNo=null;
                }
                qtdNos--;
            }
        }catch(Exception e){
            //código que será executado se ocorrer um erro
        }finally{
            //código que será executado independente do erro
        }
        
    }
    
    private No percorreLista(int posicao){
        if(posicao<qtdNos){
            No aux=primeiroNo;
            
            for(int i=0; i<posicao; i++){
                aux=aux.getProximoNo();
            }
                
            return aux;
        }
        else return null;
    }
   @Override
    public String toString(){
        
        No aux=primeiroNo;
        StringBuffer resposta=new StringBuffer("Lista Ligada: ");
        
        do{
            resposta.append(aux.getInfo()+" ");
            aux=aux.getProximoNo();
        }while(aux != null);
        
        return resposta.toString();  
    }        
    
    public int getTamanho() {
        return qtdNos;
    }

    
    
    
}
    
