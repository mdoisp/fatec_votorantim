/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pilhavetorbalanceamentoref;

public class BalanceamentoStrings {
    public static boolean validaBalanceamento(String expressao) {
        Pilha pilha = new Pilha(expressao.length());

        for (char caractere : expressao.toCharArray()) {
            if (caractere == '(' || caractere == '[' || caractere == '{') {
                pilha.push(caractere);
            } else if (caractere == ')' || caractere == ']' || caractere == '}') {
                if (pilha.isEmpty()) {
                    return false; // Se encontrar um fechamento sem uma correspondente abertura, está desbalanceado
                }
                char topo = pilha.pop();
                if ((caractere == ')' && topo != '(') || (caractere == ']' && topo != '[') || (caractere == '}' && topo != '{')) {
                    return false; // Se os tipos de parênteses não coincidirem, está desbalanceado
                }
            }
        }

        return pilha.isEmpty(); // Se a pilha estiver vazia no final, está balanceado
    }

    public static void main(String[] args) {
        String expressao1 = "[{()}]";
        String expressao2 = "{[(]}";

        System.out.println("Expressão 1 está balanceada? " + validaBalanceamento(expressao1));
        System.out.println("Expressão 2 está balanceada? " + validaBalanceamento(expressao2));
    }
}
