/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Test;
import static org.junit.Assert.*;
import recursaomatematica.Matematica;

/**
 *
 * @author Alunos
 */
public class CalculoPotencias {
    @Test
    public void testePotenciaDeDois() {
        Matematica mat = new Matematica();
        int base = 2;
        int potencia = 0;
        assertEquals(1, mat.pot(base, potencia));
        
        base = 2;
        potencia = 1;
        assertEquals(2, mat.pot(base, potencia));
        
        base = 2;
        potencia = 2;
        assertEquals(4, mat.pot(base, potencia));
    }
    
}
