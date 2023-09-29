package org.javaunittest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SalaryTest {

    // Ketika gaji >= 7000
    @Test
    public void kenaPajak (){
        Salary salary = new Salary();
        Assert.assertEquals(salary.hitungPajak(15000),1050.0);
    }

    //ketika gaji < 7000
    @Test
    public void tidakKenaPajak (){
        Salary salary = new Salary();
        Assert.assertEquals(salary.hitungPajak(6000),0.0);
    }
}
