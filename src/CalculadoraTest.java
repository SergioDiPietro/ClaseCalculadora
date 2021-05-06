import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class CalculadoraTest {
    @Test
    public void TestObjetoCreado() {
        Calculadora test = new Calculadora(5,3);
        assertNotNull(test);
    }

    @Test
    public void TestAtributos() {
        Calculadora test = new Calculadora(10,2);
        int suma = test.suma();

        int expected = 12;

        assertEquals(expected, suma);
    }
}