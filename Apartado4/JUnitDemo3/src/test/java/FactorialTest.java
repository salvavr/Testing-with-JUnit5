import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FactorialTest {
    //Instanciamos la clase que tiene el método a testear
    Factorial facto = new Factorial();

    //Creamos el método "valores" que genera el par de valores (entrada, esperado) del test
    private static Integer[][] valores() {
        return new Integer[][]{
                {0, 1}, {1, 1}, {2, 2}, {3, 6}, {4, 24}, {5, 120}
        };
    }

    //=======Método que testea al método calcula de la clase Factorial========//
    // La forma de indicarle que es un test parametrizado
    @ParameterizedTest(name = "{index}: factorial de {0}={1}")
    //La forma de indicarle que los valores vendrán inyectados a través de un método
    @MethodSource("valores")
    public void testFactorial(int entrada, int esperado) {
        assertEquals(esperado, facto.calcula(entrada));
    }
}
