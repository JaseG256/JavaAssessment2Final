package com.zipcodewilmington.assessment2.part3;

import org.junit.Assert;
import org.junit.Test;

public class RedRobinTest {

    @Test
    public void testMove() {
        Bird redRobin = new RedRobin();
        String expected = "fly";

        String actual = redRobin.move();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testMigrationMonth() {
        RedRobin redRobin = new RedRobin();
        String expected = "August";

        redRobin.setMigrationMonth(expected);
        String actual = redRobin.getMigrationMonth();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testColor() {
        Animal redRobin = new RedRobin();
        String expected = "red";

        String actual = redRobin.color();

        Assert.assertEquals(expected, actual);
    }
}
