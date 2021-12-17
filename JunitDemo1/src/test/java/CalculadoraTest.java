import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {
    //Calculadora calculadora = new Calculadora(); //InstanciaciÃ³n
    private Calculadora calculadora;

    @BeforeEach
    void creaCalculadora() {
        calculadora = new Calculadora();
    }

    @Test
    @DisplayName("suma 5 y 5")
    public void suma() {
        Assertions.assertEquals(10, calculadora.suma(5, 5)); //Verificación del método
    }

    @Test
    @DisplayName("resta 5 y 5")
    //@Disabled
    public void resta() {
        Assertions.assertEquals(1, calculadora.resta(5, 4)); //Verificación del método
    }

    @Test
    @DisplayName("multiplicación 5 por 5")
    public void multiplicacion() {
        Assertions.assertEquals(25, calculadora.multiplicacion(5, 5)); //Verificación del método
    }

    @Test
    @DisplayName("división 5 entre 5")
    public void division() {
        Assertions.assertEquals(5, calculadora.division(10, 2)); //Verificación del método
    }

    @AfterEach
    void destruyeCalculadora() {
        calculadora = null;
    }

}