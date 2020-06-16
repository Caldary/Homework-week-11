import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    Calculator calculator;

   @Before
    public void before() {
       calculator = new Calculator("calculator");
   }

    @Test
    public void add() {
        assertEquals(4, calculator.add(2, 2));
    }

    @Test
    public void subtract(){
       assertEquals(2, calculator.subtract(5, 3));
    }

    @Test
    public void multiply(){
       assertEquals(10, calculator.multiply(5, 2));
    }

    @Test
    public void divide(){
       assertEquals(5, calculator.divide(10, 2), 0.01);
    }
}
