/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pilhavetorbalanceamentoref;

public class Pilha {
    private char[] array;
    private int topo;
    private int capacidade;

    public Pilha(int capacidade) {
        this.capacidade = capacidade;
        this.array = new char[capacidade];
        this.topo = -1;
    }

    public void push(char elemento) {
        if (topo == capacidade - 1) {
            System.out.println("Estouro de pilha! Não é possível inserir mais elementos.");
            return;
        }
        topo++;
        array[topo] = elemento;
    }

    public char pop() {
        if (topo == -1) {
            System.out.println("Pilha vazia! Não é possível remover elementos.");
            return '\0';
        }
        char elemento = array[topo];
        topo--;
        return elemento;
    }

    public boolean isEmpty() {
        return topo == -1;
    }
}
