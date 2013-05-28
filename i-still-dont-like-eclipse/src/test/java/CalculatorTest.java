import org.junit.Test;

public class CalculatorTest {
    @Test
    public void canUseAdder() {
        new Calculator().calculate(1, 2);
    }

    private class Calculator {
        public int calculate(int first, int second) {
            throw new UnsupportedOperationException();
        }
    }
}
