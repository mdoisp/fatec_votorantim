/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pilhavetorpalindromo;

public class VerificaPalindromoSemStack {

    static class Pilha {
        private char[] array;
        private int top;
        private int capacity;

        public Pilha(int capacity) {
            this.capacity = capacity;
            this.array = new char[capacity];
            this.top = -1;
        }

        public void push(char element) {
            if (isFull()) {
                System.out.println("Erro: Pilha cheia");
                return;
            }
            array[++top] = element;
        }

        public char pop() {
            if (isEmpty()) {
                System.out.println("Erro: Pilha vazia");
                return '\0';
            }
            return array[top--];
        }

        public char peek() {
            if (isEmpty()) {
                System.out.println("Erro: Pilha vazia");
                return '\0';
            }
            return array[top];
        }

        public boolean isEmpty() {
            return top == -1;
        }

        public boolean isFull() {
            return top == capacity - 1;
        }
    }

    public static boolean verificaPalindromo(String palavra) {
        //palavra = palavra.replaceAll("\\s+", "").toLowerCase(); // Remover espaços e tornar minúsculas

        int tamanho = palavra.length();
        Pilha pilha = new Pilha(tamanho);

        // Empilhando a primeira metade dos caracteres da palavra
        for (int i = 0; i < tamanho / 2; i++) {
            pilha.push(palavra.charAt(i));
        }

        // Verificando se a segunda metade é igual à primeira metade reversa
        for (int i = (tamanho + 1) / 2; i < tamanho; i++) {
            if (palavra.charAt(i) != pilha.pop()) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String palavra = "Radar";
        if (verificaPalindromo(palavra)) {
            System.out.println("A palavra '" + palavra + "' é um palíndromo.");
        } else {
            System.out.println("A palavra '" + palavra + "' não é um palíndromo.");
        }
    }
}
