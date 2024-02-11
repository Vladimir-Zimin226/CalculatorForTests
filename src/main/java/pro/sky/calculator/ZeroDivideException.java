package pro.sky.calculator;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class ZeroDivideException extends IllegalArgumentException {
    public ZeroDivideException() {
        super("ERROR! На ноль делить нельзя!");
    }
}
