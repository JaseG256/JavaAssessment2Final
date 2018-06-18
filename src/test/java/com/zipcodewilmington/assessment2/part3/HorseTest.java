package com.zipcodewilmington.assessment2.part3;

import org.junit.Assert;
import org.junit.Test;

public class HorseTest {

    @Test
    public void testMove() {
        Animal horse = new Horse();
        String expected = "gallop";

        String actual = horse.move();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testColor() {
        Animal horse = new Horse();
        String expected = "brown";

        String actual = horse.color();

        Assert.assertEquals(expected, actual);
    }
}
