import listasnos.ListaLigada;
import listasnos.No;
import org.junit.Test;
import static org.junit.Assert.*;

public class TesteListaLigada {
    @Test
    public void testeCriacaoDeNos() {
        /*Object info = "Matheus";
        No proximoNo = null;
        No meuPrimeiroNo = new No(info, proximoNo);
        assertEquals("Matheus", meuPrimeiroNo.getInfo());*/
        ListaLigada minhaLista = new ListaLigada();
        minhaLista.add("Matheus");
        minhaLista.add("Juliana");
        assertEquals("Matheus", minhaLista.get(0));
        assertEquals("Juliana", minhaLista.get(1));
    }
    
}
