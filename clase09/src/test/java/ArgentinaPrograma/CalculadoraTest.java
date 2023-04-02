package ArgentinaPrograma;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    final Calculadora calc = new Calculadora();

    @Test
    void multiplicar() {
        assertEquals(240, calc.multiplicar(80, 3));
        assertNotEquals(605, calc.multiplicar(calc.restar(90, 50), 15));
        assertNotEquals(2700, calc.multiplicar(calc.sumar(70, 40), 25));
    }

    @Test
    void dividir() {
        assertEquals(110, calc.dividir(calc.sumar(150, 180), 3));
        assertThrows(ArithmeticException.class, ()-> calc.dividir(75, 0));
    }
}