package pro.sky.calculator;

public interface CalculatorService {
    String calculatorIntro();

    String calculatorHello();

    float calculatePlus (Float num1, Float num2);

    float calculateMinus(Float num1, Float num2);

    float calculateMultiply(Float num1, Float num2);

    float calculateDivide(Float num1, Float num2);
}
