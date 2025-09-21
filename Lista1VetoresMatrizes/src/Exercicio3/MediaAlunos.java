package Exercicio3;

public class MediaAlunos {
    
    public MediaAlunos(){
    }
    
    public float[][] calculaMedia(float[][] matriz){
        for(int l=0; l<matriz.length; l++){
            float somador = 0;
            for(int c=1; c<(matriz[l].length-1); c++){
                somador += matriz[l][c];
            }
            matriz[l][matriz[l].length-1] = somador / (matriz[l].length - 2);
        }
        return matriz;
    }
}
