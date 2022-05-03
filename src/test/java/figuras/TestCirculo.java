package figuras;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestCirculo {

    @Test
    public void testGetArea() {
        double lado = 4;
        double retornoEsperado = 16.0;
        Quadrado quadrado = new Quadrado("", lado);
        double retornoFeito = quadrado.getArea();
        assertEquals(retornoEsperado, retornoFeito, 0);
    }
}
