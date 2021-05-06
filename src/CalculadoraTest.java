import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class CalculadoraTest {

// 1.- La clase se ha creado. (existe el objeto)

    @Test
    public void testObjetoCreado() {
        Calculadora test = new Calculadora(5,3);
        assertNotNull(test);
    }

// 2.- Los atributos de la clase tiene el valor correcto.    

    @Test
    public void testAtributos() {
        Calculadora test = new Calculadora(10,2);

        assertEquals(10, test.getA());
        assertEquals(2, test.getB());
    }

// 3.- Comprobar cada uno de los métodos. 

    @Test
    public void testSuma() {
        Calculadora test = new Calculadora(10,10);

        int expected = 20;
        assertEquals(test.suma(), expected);
    }

    @Test
    public void testResta() {
        Calculadora test = new Calculadora(10,10); 

        int expected = 0;
        assertEquals(test.resta(), expected);
    }

    @Test
    public void testDivision() {
        Calculadora test = new Calculadora(5,2); 

        double expected = 2.5;
        assertEquals(test.division(), expected);
    }

    @Test
    public void testValorAbsoluto() {
        Calculadora test = new Calculadora(-10,10); 

        int expected = 10;
        assertEquals(test.valorAbsoluto(), expected);
    }

    @Test
    public void testElevar() {
        Calculadora test = new Calculadora(2,3);

        double expected = 8;
        assertEquals(test.elevar(), expected);
    }
}