package figuras;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestRetangulo {

    @Test
    public void testGetArea() {
        double altura = 3;
        double base = 2;
        double retornoEsperado = 6;
        Retangulo retangulo = new Retangulo("", base, altura);
        double retornoFeito = retangulo.getArea();
        assertEquals(retornoEsperado, retornoFeito, 0);
    }

    @Test
    public void testRetangulo() {
        Retangulo retangulo = new Retangulo();
        assertTrue(("".equals(retangulo.getCor()) && retangulo.getAltura() == 0 && retangulo.getBase() == 0));
    }
}
