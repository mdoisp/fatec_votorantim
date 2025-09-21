/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Test;
import static org.junit.Assert.*;
import tecnicasaula3.Pessoa;

/**
 *
 * @author Alunos
 */
public class TestePessoa {
    @Test
    public void ArvoreGenealogicaMaterna() {
        Pessoa maria = new Pessoa("Maria");
        Pessoa ana = new Pessoa("Ana", maria);
        Pessoa pedro = new Pessoa("Pedro", ana);
        System.out.println(pedro.arvoreGenealogica());
        assertEquals("Pedro -> Ana -> Maria", pedro.arvoreGenealogica());
    }
}
