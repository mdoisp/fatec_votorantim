package Exercicio4;

public class Exercicio4VetoresMatrizes {
    public static void main(String[] args) {
        MediaModaDesvio mmd = new MediaModaDesvio();
        float[][] matriz = new float[][]{
            {1, 8, 5, 7, 6.66f},
            {2, 3, 7, 5, 5},
            {3, 7, 4, 8, 6},
            {4, 0, 8, 7, 5},
            {5, 7, 4, 5, 5.33f}
        };
        mmd.calculaMMD(matriz);
        
        for (int i = 0; i < mmd.calculaMMD(matriz).length; i++) {
            System.out.printf("Prova %d: Media = %.2f | Moda = %.2f | Desvio Padrao = %.2f%n", i+1, mmd.calculaMMD(matriz)[i][0], mmd.calculaMMD(matriz)[i][1], mmd.calculaMMD(matriz)[i][2]);
        }
    }
}
