package Exercicio3;

public class Exercicio3VetoresMatrizes {
    public static void main(String[] args) {
        MediaAlunos ma = new MediaAlunos();
        float[][] matriz = new float[][]{
            {1, 8, 5, 7, 0},
            {2, 3, 7, 5, 0},
            {3, 7, 4, 8, 0},
            {4, 0, 8, 7, 0},
            {5, 7, 4, 5, 0}
        };
        ma.calculaMedia(matriz);
        for(int l=0; l<matriz.length; l++){
            for(int c=0; c<matriz.length; c++){
                System.out.println(matriz[l][c]);
            }
        System.out.println();
        }
    }
}
