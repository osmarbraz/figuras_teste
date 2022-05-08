package figuras;

import static org.junit.Assert.assertNotNull;
import org.junit.Test;


public class TestPrincipal {

    @Test
    public void testMainTriangulo() {
        Triangulo triangulo = new Triangulo();
        assertNotNull(triangulo);        
    }
    @Test
    public void testMainRetangulo() {
        Retangulo retangulo = new Retangulo();
        assertNotNull(retangulo);
    }
    
    @Test
    public void testMainQuadrado() {
        Quadrado quadrado = new Quadrado();
        assertNotNull(quadrado);
    }
    
    @Test
    public void testMainCirculo() {
        Circulo circulo = new Circulo();
        assertNotNull(circulo);
    }
}
