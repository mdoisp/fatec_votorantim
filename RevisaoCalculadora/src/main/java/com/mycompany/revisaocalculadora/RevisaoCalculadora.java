package com.mycompany.revisaocalculadora;
import java.util.Scanner;
    /*public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x; 
        int y;
        int z;
        int result;
        
        System.out.println("Digite o primeiro número inteiro: ");
        x = input.nextInt();
        
        System.out.println("Digite o segundo número inteiro: ");
        y = input.nextInt();
        
        System.out.println("Digite o terceiro número inteiro: ");
        z = input.nextInt();
        
        result = x*y*z;
        
        System.out.println("Product is: "+ result);
    }
}
*/
public class RevisaoCalculadora {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Calculo calc = new Calculo();
        int comando = -1;
        while(comando!= 0){
            System.out.println("Escolha a opção: \n "
                    + "1 - soma \n"
                    + "2 - Subtração \n"
                    + "3 - Multiplicação \n"
                    + "4 - Divisão \n"
                    + "0 - Encerrar calculadora\n");
            comando = input.nextInt();
            if(comando == 1){
            int numeroA;
            int numeroB;
            System.out.println("Digite o primeiro número: ");
            numeroA = input.nextInt();
            System.out.println("Digite o segundo número: ");
            numeroB = input.nextInt();
            System.out.println("A soma é: "+calc.Somar(numeroA, numeroB));
            }else if(comando == 2){
                int numeroA;
                int numeroB;
                System.out.println("Digite o primeiro número: ");
                numeroA = input.nextInt();
                System.out.println("Digite o segundo número: ");
                numeroB = input.nextInt();
                System.out.println("A subtração é: "+calc.Subtrair(numeroA, numeroB));
            }else if(comando == 3){
                int numeroA;
                int numeroB;
                System.out.println("Digite o primeiro número: ");
                numeroA = input.nextInt();
                System.out.println("Digite o segundo número: ");
                numeroB = input.nextInt();
                System.out.println("A subtração é: "+calc.Multiplicar(numeroA, numeroB));
            }else if(comando == 4){
                int numeroA;
                int numeroB;
                System.out.println("Digite o primeiro número: ");
                numeroA = input.nextInt();
                System.out.println("Digite o segundo número: ");
                numeroB = input.nextInt();
                System.out.println("A divisão é: "+calc.Dividir(numeroA, numeroB));
            }
        } 
    }
}
