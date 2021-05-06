import static org.junit.Assert.*;
import org.junit.Test;

public class CalculadoraTest {
    @Test
    public void TestObjetoCreado() {
        Calculadora test = new Calculadora(5,3);
        assertNotNull(test);
    }
}