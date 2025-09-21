/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author Alunos
 */
public class Pessoa {
    //Atributos da classe
    String nome;
    int qtdFilhos, qtdIrmaos;
    String[] nomeFilhos = new String[20];
    
    /*Método "Apresentar", responde com o nome
    concatenado e a quantidade de filhos
    */
    public String Apresentar(){
        return nome + " possui " + qtdFilhos + " filho(s)";
    }
    public String ApresentarFilhos(){
        String resposta = "Meus filhos são ";
        int qtdFilhoAux = 0;
        for(int i=0; i<20; i++){
            if(nomeFilhos[i] != null){
                qtdFilhoAux++;
            resposta += nomeFilhos[i]+", ";
            }
        }
        if (qtdFilhoAux > 0)
            return resposta + "Qtd Filhos:" + qtdFilhoAux;
        else
            return "Não tem filhos!";
    }
}
