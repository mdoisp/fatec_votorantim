package Exercicio5;

public class MediaModaDesvio {
    
    public MediaModaDesvio(){
    }
    
    public float[][] calculaMMD(float[][] matriz){
        float[][] resultados = new float[4][3];
        for (int c = 1; c < matriz[0].length; c++) {
            float soma = 0;
            int contador = 0;
            float moda = 0;
            for (int l = 0; l < matriz.length; l++) {
                soma += matriz[l][c];
            }
            for (int l = 0; l < matriz.length; l++) {
                int freq = 0;
                for (int i = 0; i < matriz.length; i++) {
                    if (matriz[l][c] == matriz[i][c]) {
                        freq++;
                    }
                }
                if (freq > contador) {
                    contador = freq;
                    moda = matriz[l][c];
                }
            }
            float media = soma / matriz.length;
            resultados[c-1][0] = media;
            resultados[c-1][1] = moda;
            soma = 0;
            for (int l = 0; l < matriz.length; l++) {
                soma += (matriz[l][c] - media) * (matriz[l][c] - media);
            }
            float variancia = soma / (matriz.length - 1); // variancia
            resultados[c-1][2] = (float) Math.sqrt(variancia); // desvio padrao
        }
        return resultados;
    }
}