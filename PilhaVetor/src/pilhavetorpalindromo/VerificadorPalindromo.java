package pilhavetorpalindromo;

import java.util.Stack;

public class VerificadorPalindromo {

    public static boolean verificaPalindromo(String palavra) {
        // Remove espaços em branco e converte para minúsculas para ignorar diferenças de maiúsculas e minúsculas
        palavra = palavra.replaceAll("\\s+", "").toLowerCase();

        Stack<Character> pilha = new Stack<>();

        // Empilha as letras da palavra
        for (int i = 0; i < palavra.length(); i++) {
            pilha.push(palavra.charAt(i));
        }

        // Verifica se as letras desempilhadas são iguais às letras originais
        for (int i = 0; i < palavra.length(); i++) {
            if (palavra.charAt(i) != pilha.pop()) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String palavra = "Matheus";
        if (verificaPalindromo(palavra)) {
            System.out.println("A palavra '" + palavra + "' é um palíndromo.");
        }else {
            System.out.println("A palavra '" + palavra + "' não é um palíndromo.");
        }
    }
}
