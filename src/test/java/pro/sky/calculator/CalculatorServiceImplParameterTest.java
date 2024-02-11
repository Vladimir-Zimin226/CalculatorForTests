package pro.sky.calculator;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static pro.sky.calculator.CalculatorServiseImplTestConstants.*;

public class CalculatorServiceImplParameterTest {

    private final CalculatorServiceImpl out = new CalculatorServiceImpl();

    @MethodSource("provideArgumentsForCalculatorTests")
    @ParameterizedTest
    public void shouldReturnCorrectResultOfSummation(float num1, float num2) {
        assertEquals(num1 + num2, out.calculatePlus(num1, num2));
    }

    @MethodSource("provideArgumentsForCalculatorTests")
    @ParameterizedTest
    public void shouldReturnCorrectResultOfSubtraction(float num1, float num2) {
        assertEquals(num1 - num2, out.calculateMinus(num1, num2));
    }

    @MethodSource("provideArgumentsForCalculatorTests")
    @ParameterizedTest
    public void shouldReturnCorrectResultOfMultiply(float num1, float num2) {
        assertEquals(num1 * num2, out.calculateMultiply(num1, num2));
    }

    @MethodSource("provideArgumentsForCalculatorTests")
    @ParameterizedTest
    public void shouldReturnCorrectResultOfDivide(float num1, float num2) {
        assertEquals(num1 / num2, out.calculateDivide(num1, num2));
    }

    private static Stream<Arguments> provideArgumentsForCalculatorTests() {
        return Stream.of(
                Arguments.of(ZERO, ONE),
                Arguments.of(ONE, ONE),
                Arguments.of(ONE, TWO),
                Arguments.of(TWO, TWO)
        );
    }
}
