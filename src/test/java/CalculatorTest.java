
import org.junit.*;

public class CalculatorTest {

    private Main calculator;

    @Before
    public void setUp() {
        calculator = new Main();
    }

    @Test
    public void testSquareRoot() {
        double x = 81 ;
        double expectedResult = 9.0;
        double actualResult = Main.square_root(x);
        Assert.assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void testFactorial() {
        int a = 6;
        double expectedResult = 720;
        double actualResult = Main.factorial(a);
        Assert.assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void testNatLog() {
        double x  = 10 ;
        double expectedResult = 2.302585;
        double actualResult = Main.natural_log(x);
        Assert.assertEquals(expectedResult, actualResult, 0.001);
    }

    @Test
    public void testPower() {
        double a = 4.0;
        double b = 4.0;
        double expectedResult = 256.0;
        double result = Main.power(a, b);
        Assert.assertEquals(expectedResult, result, 0.001);
    }

}
