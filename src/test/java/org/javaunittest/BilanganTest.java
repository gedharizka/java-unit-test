package org.javaunittest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class BilanganTest {
    //test Bilangan gepap
    @Test
    public void testBilanganGenap(){
        Bilangan bilangan= new Bilangan();
        Assert.assertEquals(bilangan.cekGenapGanjil(4), "Genap");
    }
    //test Bilangan ganjil
    @Test
    public void testBilanganGanjil(){
        Bilangan bilangan= new Bilangan();
        Assert.assertEquals(bilangan.cekGenapGanjil(3), "Ganjil");
    }
}
