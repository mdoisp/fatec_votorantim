package pilhavetorbalanceamentoproprio;

public class Balanceamento {
    public static void main(String[] args) {
        String[] vetor = new String[]{"(","}"};
        System.out.println(validabalanceamento(vetor));
        String[] vetor2 = new String[]{"(",")","{","}"};
        System.out.println(validabalanceamento(vetor2));
    }
    public static boolean validabalanceamento(String[] vetor){
        PilhaVetor p = new PilhaVetor(vetor.length);
        for(int i=0; i<vetor.length; i++){
            if(vetor[i] == "(" || vetor[i] == "{" || vetor[i] == "["){
                if(vetor[i] == "("){
                    p.empilhar(")");
                }
                if(vetor[i] == "{"){
                    p.empilhar("}");
                }
                if(vetor[i] == "["){
                    p.empilhar("]");
                }
            }
            else if(vetor[i] == ")" || vetor[i] == "}" || vetor[i] == "]"){
                if(p.verificaPilhaVazia()){
                    return false;
                }
                else if(vetor[i] != p.desempilha()){
                    return false;
                }
            }    
        }
    return p.verificaPilhaVazia();
    }
}
