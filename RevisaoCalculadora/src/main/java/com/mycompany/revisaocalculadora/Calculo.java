package com.mycompany.revisaocalculadora;

public class Calculo {
    
    public Calculo(){
    }
    
    public int Somar(int numeroA, int numeroB){
    return numeroA + numeroB;
    }
    public int Subtrair(int numeroA, int numeroB){
        return  numeroA - numeroB;
    }
    public int Multiplicar(int numeroA, int numeroB){
        return  numeroA * numeroB;
    }
    public Object Dividir(int numeroA, int numeroB){
        if(numeroB > 0){
            return numeroA / numeroB;
        }else
        return "Erro, não é possível dividir por zero";
    }
}
