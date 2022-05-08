package figuras;

import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class TestFigura {

    @Test
    public void testGetCor() {
        double lado = 5;
        String retornoEsperado = "Verde";        
        Figura circulo = new Circulo();
        circulo.setCor("Verde");
        assertTrue(retornoEsperado.equals(circulo.getCor()));
    }
}