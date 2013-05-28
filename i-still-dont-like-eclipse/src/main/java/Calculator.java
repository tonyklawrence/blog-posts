public class Calculator {
    private final Function function;

    public Calculator(Function function) {
        this.function = function;
    }

    public int calculate(int first, int second) {
        return function.apply(first, second);
    }
}
