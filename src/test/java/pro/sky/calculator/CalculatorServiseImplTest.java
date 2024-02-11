package pro.sky.calculator;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static pro.sky.calculator.CalculatorServiseImplTestConstants.*;

public class CalculatorServiseImplTest {

    private final CalculatorServiceImpl out = new CalculatorServiceImpl();

    @Test
    public void shouldReturn3WhenSum1And2() {
        assertEquals(THREE, out.calculatePlus(ONE, TWO));
    }

    @Test
    public void shouldReturn2WhenSum0And2() {
        assertEquals(TWO, out.calculatePlus(ZERO, TWO));
    }

    @Test
    public void shouldReturn0WhenSubtract2And2() {
        assertEquals(ZERO, out.calculateMinus(TWO, TWO));
    }

    @Test
    public void shouldReturn1WhenSubtract2And1() {
        assertEquals(ONE, out.calculateMinus(TWO, ONE));
    }

    @Test
    public void shouldReturn1WhenMultiply1And1() {
        assertEquals(ONE, out.calculateMultiply(ONE, ONE));
    }

    @Test
    public void shouldReturn2WhenMultiply2And1() {
        assertEquals(TWO, out.calculateMultiply(TWO, ONE));
    }

    @Test
    public void shouldReturn1WhenDivide2And2() {
        assertEquals(ONE, out.calculateDivide(TWO, TWO));
    }

    @Test
    public void shouldReturn2WhenDivide2And1() {
        assertEquals(TWO, out.calculateDivide(TWO, ONE));
    }

    @Test
    public void shouldThrowZeroDividerExceptionWhenDivideAnyNumAnd0() {
        assertThrows(ZeroDivideException.class, () -> out.calculateDivide(TWO, ZERO));
    }

}
