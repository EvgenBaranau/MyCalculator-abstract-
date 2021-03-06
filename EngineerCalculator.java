import java.util.List;

/**
 * Created by Администратор on 08.02.2017.
 */
public class EngineerCalculator extends AbstractCalculator {
    @Override
    double calculate(List<String> list) {
        double result = 0;
        for (int i = 1; i < list.size(); i++) {
            switch (list.get(i)) {
                case "+":
                    result = addition(result, Double.valueOf(list.get(++i)));
                    break;
                case "-":
                    result = subtraction(result, Double.valueOf(list.get(++i)));
                    break;
                case "*":
                    result = multiplication(result, Double.valueOf(list.get(++i)));
                    break;
                case "/":
                    result = division(result, Double.valueOf(list.get(++i)));
                    break;
                case "cos":
                    result = getCos(result);
                    break;
                case "exp":
                    result = getExp(result);
                    break;
                case "sqrt":
                    result = getSqrt(result);
                    break;
                default:
                    result = Double.valueOf(list.get(i));
                    break;
            }
        }
        return result;
    }
}
