package Exercicio5;

public class Exercicio5VetoresMatrizes {
    public static void main(String[] args) {
        MediaModaDesvio mmd = new MediaModaDesvio();
        float[][] matriz = new float[][]{
            {1, 8, 5, 7, 6.66f},
            {2, 3, 7, 5, 5},
            {3, 7, 4, 8, 6},
            {4, 0, 8, 7, 5},
            {5, 7, 4, 5, 5.33f}
        };
        
        float[][] novaMatriz = mmd.calculaMMD(matriz);
        System.out.printf("%-6s | %-7s | %-7s | %-14s%n", "|", "Media", "Moda", "Desvio Padrao |");
        for (int i = 0; i < novaMatriz.length; i++) {
            if(i < 3){
                System.out.printf("|P%-5d| ", i+1);
            }else{
                System.out.printf("|PMedia| ");
            }
            for (int j = 0; j < novaMatriz[i].length; j++) {
                if (j > 0) {
                    System.out.printf(" | ");
                }
                System.out.printf(" %-6.2f", novaMatriz[i][j]);
            }
            System.out.println("       |");
        }
    }
}
