package figuras;

import figuras.Retangulo;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

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
}
