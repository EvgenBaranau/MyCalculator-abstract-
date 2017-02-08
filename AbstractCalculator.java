import java.util.List;

/**
 * Created by Администратор on 08.02.2017.
 */
public abstract class AbstractCalculator {

    public double addition(double x, double y) {
        return x + y;
    }

    public double subtraction(double x, double y) {
        return x - y;
    }

    public double multiplication(double x, double y) {
        return x * y;
    }

    public double division(double x, double y) {
        return x / y;
    }

    public double getCos(double x) { // cos
        return Math.cos(x);
    }

    public double getExp(double x) {
        return Math.exp(x);
    } // exp

    public double getSqrt(double x) {
        return Math.sqrt(x);
    } // sqrt

    abstract double calculate(List<String> list);

    public static double parseAndCalculate(List<String> list) { // метод вызывает нужную реализацию калькулятора
        switch (list.get(0)) {
            case "1":
                return new SimpleCalculator().calculate(list);
            case "2":
                return new SimpleCalculatorWithMemory().calculate(list);
            case "3":
                return new EngineerCalculator().calculate(list);
            case "4":
                return new EngineerCalculatorWithMemory().calculate(list);
            default:
                throw new IllegalArgumentException("Wrong input data (calculator number)!");
        }
    }
}






