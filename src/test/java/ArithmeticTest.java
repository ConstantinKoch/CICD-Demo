import org.junit.Test;

import static org.junit.Assert.*;


public class ArithmeticTest {

    Arithmetic arithmetic = new Arithmetic();

    @Test
    public void additionTest() {
        assertEquals("Addition didn't work!", 5.0f, arithmetic.add(2.0f, 3.0f), 0);
    }

    @Test
    public void subtractTest() {
        assertEquals("Subtraction didn't work!", 5.0f, arithmetic.subtract(8.0f, 3.0f), 0);
    }

    @Test
    public void multiplyTest() {
        assertEquals("Multiplication didn't work!", 144.0f, arithmetic.multiply(12.0f, 12.0f), 0);
    }

    @Test
    public void divideTest() {
        try {
            assertEquals("Division didn't work!", 5.0f, arithmetic.divide(50.0f, 10.0f), 0);
        } catch (DivisionByZeroException e) {
            fail(e.getMessage());
        }
    }


    @Test
    public void powTest() {
        assertEquals(1024f, arithmetic.pow(4, 5), 0);
    }


}
