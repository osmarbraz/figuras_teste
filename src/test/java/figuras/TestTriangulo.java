package figuras;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestTriangulo {

    @Test
    public void testGetArea() {
        double altura = 3;
        double base = 2;
        double retornoEsperado = 3.0;
        Triangulo triangulo = new Triangulo("", base, altura);
        double retornoFeito = triangulo.getArea();
        assertEquals(retornoEsperado, retornoFeito, 0);
    }

    @Test
    public void testTriangulo() {
        Triangulo triangulo = new Triangulo();
        assertTrue(("".equals(triangulo.getCor()) && triangulo.getAltura() == 0 && triangulo.getBase() == 0));
    }
}
