package pilhavetorbalanceamentoproprio;

public class PilhaVetor {
    int registraTopo;
    String[] vetorPilha;
    
    public PilhaVetor(int tamanho){
        registraTopo = 0;
        vetorPilha = new String[tamanho];
    }
    public String empilhar(String entrada){
        if (registraTopo < vetorPilha.length){
            vetorPilha[registraTopo] = entrada;
            registraTopo++;
            return "";
        }
        else{
            return "Não é possível empilhar";
        }
    }
    public String desempilha(){
        if(registraTopo > 0){
            registraTopo--;
            return vetorPilha[registraTopo];
        }
        else{
            return "Não é possível desempilhar mais";
        }
    }
    public boolean verificaPilhaCheia(){
        return vetorPilha.length == registraTopo;
    }
    public boolean verificaPilhaVazia(){
        return registraTopo == 0;
    }
}
