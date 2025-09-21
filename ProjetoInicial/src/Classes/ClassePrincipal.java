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
public class ClassePrincipal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pessoa pai;
        pai = new Pessoa();
        pai.nome = "Matheus";
        pai.qtdFilhos = 2;
        pai.qtdIrmaos = 1;
        System.out.println(pai.nome + " possui " + pai.qtdFilhos + " filho(s) e " + pai.qtdIrmaos + " irmão(s)");
        
        Pessoa mae = new Pessoa();
        mae.nome = "Gabriela";
        mae.qtdFilhos = 2;
        mae.qtdIrmaos = 3;
        System.out.println(mae.nome + " possui " + mae.qtdFilhos + " filho(s) e " + mae.qtdIrmaos + " irmão(s)");
        
        System.out.println(pai.Apresentar());
        System.out.println(mae.Apresentar());
        System.out.println(mae.ApresentarFilhos());
        mae.nomeFilhos[0] = "Maria";
        mae.nomeFilhos[1] = "João";
        System.out.println(mae.ApresentarFilhos());
    }
    
}
