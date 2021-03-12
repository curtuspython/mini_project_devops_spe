package calculator;
import static org.junit.Assert.*;
import org.junit.*;

public class CalculatorTest {

    private ScientificCalculator calculator;

    @Before
    public void setUp() {
        calculator = new ScientificCalculator();
    }

    @Test
    public void testSquareRoot() {
        double x = 16 ;
        double expectedResult = 4.0;
        double actualResult = ScientificCalculator.square_root(x);
        Assert.assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void testFactorial() {
        int a = 5;
        double expectedResult = 120;
        double actualResult = ScientificCalculator.factorial(a);
        Assert.assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void testNatLog() {
        double x  = 10 ;
        double expectedResult = 2.302585;
        double actualResult = ScientificCalculator.natural_log(x);
        Assert.assertEquals(expectedResult, actualResult, 0.001);
    }

    @Test
    public void testPower() {
        double a = 3.0;
        double b = 4.0;
        double expectedResult = 81.0;
        double result = ScientificCalculator.power(a, b);
        Assert.assertEquals(expectedResult, result, 0.001);
    }

}
