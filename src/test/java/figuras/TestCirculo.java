package figuras;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestCirculo {

    @Test
    public void testGetArea() {
        double lado = 5;
        double retornoEsperado = 78.53750000000001;        
        Circulo circulo = new Circulo("", lado);
        double retornoFeito = circulo.getArea();
        assertEquals(retornoEsperado, retornoFeito, 0);
    }
}
