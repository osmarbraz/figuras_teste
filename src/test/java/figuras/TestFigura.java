package figuras;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestFigura {

    @Test
    public void testGetCor() {
        String retornoEsperado = "Verde";
        Figura circulo = new Circulo();
        circulo.setCor("Verde");
        assertEquals(retornoEsperado, circulo.getCor());
    }
}
