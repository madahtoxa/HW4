package pro.skycalculator;


@org.springframework.stereotype.Service
public class CalculatorService  {

    public int plus(int a, int b) {
        return a + b;
    }

    public int minus(int a, int b) {
        return a - b;
    }

    public int multyply(int a, int b) {
        return a * b;
    }

    public int devide(int a, int b) {
        return a / b;
    }
}
