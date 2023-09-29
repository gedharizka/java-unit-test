package org.javaunittest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTest {
    @Test
    public  void testAdd(){
        Calculator calculator = new Calculator();
        int actual = calculator.add(7,8);
        // expected = 15 dan actual setelah execution
        Assert.assertEquals(actual,15);
    }

    @Test
    public void testSubtract(){
        Calculator calculator = new Calculator();
        int actual = calculator.substract(7,4);

        Assert.assertEquals(actual, 3);
    }
}
