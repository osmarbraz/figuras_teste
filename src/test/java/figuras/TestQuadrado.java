package figuras;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestQuadrado {

    @Test
    public void testGetArea() {
        double lado = 4;
        double retornoEsperado = 16.0;
        Quadrado quadrado = new Quadrado("", lado);
        double retornoFeito = quadrado.getArea();
        assertEquals(retornoEsperado, retornoFeito, 0);
    }
    
    @Test
    public void testQuadrado() {        
        Quadrado quadrado = new Quadrado();        
        assertTrue(("".equals(quadrado.getCor()) && quadrado.getLado()==0));
    }  
}
