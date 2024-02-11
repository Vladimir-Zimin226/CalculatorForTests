package pro.sky.calculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    public String calculatorIntro() {
        return "<strong><BLOCKQUOTE><font size=\"20\" color= \"000000\">Введите /calculator и сможете воспользоваться последней версией калькулятора Java</font></BLOCKQUOTE></strong>";
    }

    public String calculatorHello() {
        return "<strong><BLOCKQUOTE><font size=\"20\" color= \"FF0000\">Добро пожаловать в калькулятор!!!</font></BLOCKQUOTE></strong>"
                + "<strong><BLOCKQUOTE><font size=\"20\" color= \"0000ff\">Чтобы выполнить операцию сложения введите /plus?num1=X&num2=Y, а вместо X и Y подставьте любые числа</font></BLOCKQUOTE></strong>" +
                "<strong><BLOCKQUOTE><font size=\"20\" color= \"00FA9A\">Чтобы выполнить операцию вычитания введите /minus?num1=X&num2=Y</font></BLOCKQUOTE></strong>" +
                "<strong><BLOCKQUOTE><font size=\"20\" color= \"FF00FF\">Чтобы выполнить операцию умножения введите /multiply?num1=X&num2=Y</font></BLOCKQUOTE></strong>" +
                "<strong><BLOCKQUOTE><font size=\"20\" color= \"0000FF\">Чтобы выполнить операцию деления введите /divide?num1=X&num2=Y</font></BLOCKQUOTE></strong>";
    }


    public float calculatePlus(Float num1, Float num2) {
        return num1 + num2;
    }

    public float calculateMinus(Float num1, Float num2) {
        return num1 - num2;
    }

    public float calculateMultiply(Float num1, Float num2) {
        return num1 * num2;
    }

    public float calculateDivide(Float num1, Float num2) {
        if (num2 == 0) {
            throw new ZeroDivideException();
        }
        return num1 / num2;
    }
}

