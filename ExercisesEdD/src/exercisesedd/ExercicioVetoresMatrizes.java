package exercisesedd;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alunos
 */
public class ExercicioVetoresMatrizes {
    /*Exercício 3 - Crie um método que receba como parâmetro um vetor
    de números binários com 8 posições, calcule e retorne o valor em decimal.*/
    public double converteBinDec(int[] entrada){
        int[] decimal = new int[]{128, 64, 32, 16, 8, 4, 2, 1};
        double[] decimalAndreza = new double[8];
        double soma = 0;
        
        for (int pot = 7; pot >= 0; pot--){
            decimalAndreza[pot] = Math.pow(2, pot);
            System.out.print(decimalAndreza[pot] + "\t");
            System.out.print(decimal[pot] + "\t");
            soma = soma + (decimalAndreza[pot]*entrada[7-pot]);
            System.out.print(entrada[pot] + "\t\n");
        }
        System.out.println("Resposta: "+ soma);
        return soma;
    }
}
