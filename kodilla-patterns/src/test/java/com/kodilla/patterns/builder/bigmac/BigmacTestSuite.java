package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {

    @Test
    public void testBigmacNew() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .roll("Sezame")
                .burgers(200)
                .sauce("Barbecue")
                .ingredient("Becon")
                .ingredient("Cheese")
                .ingredient("Onion")
                .ingredient("Chilli pepper")
                .ingredient("Salad")
                .build();
        System.out.println(bigmac);
        //When
        int howManyIngredients = bigmac.getIngredients().size();
        //Then
        Assert.assertEquals(5, howManyIngredients);
    }
}




