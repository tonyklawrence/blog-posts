import org.jmock.Expectations;
import org.jmock.integration.junit4.JUnitRuleMockery;
import org.junit.Rule;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class CalculatorTest {
    @Rule public final JUnitRuleMockery context = new JUnitRuleMockery();

    private final Function function = context.mock(Function.class);

    @Test
    public void willUseGivenFunction() {
        context.checking(new Expectations() {{
            oneOf(function).apply(1, 2); will(returnValue(3));
        }});

        assertThat(new Calculator(function).calculate(1, 2), is(3));
    }
}
