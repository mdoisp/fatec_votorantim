package Exercicio2;

public class PositivoNegativo {
    
    public PositivoNegativo(){ 
    }
    
    public String[] verificaNumero(String[] vetor){
    int i;
        for(i=0; i<vetor.length; i++){
            if(Integer.parseInt(vetor[i]) < 0){
                vetor[i]= "N";
            }
            else{
                vetor[i] = "P";
            }
        }
        return vetor;
    }
}
