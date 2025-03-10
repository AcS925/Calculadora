import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class CalculadoraTest {

    @BeforeAll
    static void setUpBeforeClass() {
        System.out.println("---Inicio de las pruebas---");
    }

    @AfterAll
    static void tearDownAfterClass() {
        System.out.println("---Final de las pruebas---");
    }

    @Test
    void testSumar() {
        assertEquals(5, Calculadora.sumar(2, 3));
    }

    @Test
    void testDividirPorCero() {
        assertThrows(ArithmeticException.class, () -> Calculadora.dividir(5, 0));
    }
}
