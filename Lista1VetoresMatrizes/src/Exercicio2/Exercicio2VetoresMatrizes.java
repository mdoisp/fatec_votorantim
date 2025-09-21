package Exercicio2;

public class Exercicio2VetoresMatrizes {
    public static void main(String[] args) {
        String[] vetor = {"1", "-1", "2", "-2", "3"};
        PositivoNegativo pn = new PositivoNegativo();
        pn.verificaNumero(vetor);
        for(int i=0; i < vetor.length; i++){
            System.out.println(vetor[i]);
        }
    }
}
