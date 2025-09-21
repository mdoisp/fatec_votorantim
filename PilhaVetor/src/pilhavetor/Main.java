package pilhavetor;

import pilhavetorbalanceamentoproprio.PilhaVetor;

public class Main {
    public static void main(String[] args) {
        PilhaVetor pilhaA = new PilhaVetor(15);
        PilhaVetor pilhaB = new PilhaVetor(15);
        pilhaA.empilhar("M");
        pilhaA.empilhar("A");
        pilhaA.empilhar("T");
        pilhaA.empilhar("H");
        pilhaA.empilhar("E");
        pilhaA.empilhar("U");
        pilhaA.empilhar("S");
        System.out.println(pilhaA.desempilha());
        System.out.println(pilhaA.desempilha());
        System.out.println(pilhaA.desempilha());
        System.out.println(pilhaA.desempilha());
        System.out.println(pilhaA.desempilha());
        System.out.println(pilhaA.desempilha());
        System.out.println(pilhaA.desempilha());
        //System.out.println(pilhaA.verificaPilhaVazia());
    }
}
