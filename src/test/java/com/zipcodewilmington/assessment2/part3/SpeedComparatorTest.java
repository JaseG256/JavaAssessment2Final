package com.zipcodewilmington.assessment2.part3;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class SpeedComparatorTest {

    @Test
    public void testArraySort(){
        Animal horse = new Horse();
        Animal blueJay = new BlueJay();
        Animal redRobin = new RedRobin();

        Animal[] animals = {redRobin, horse, blueJay};

        Arrays.sort(animals, new SpeedComparator());

        Assert.assertEquals(horse, animals[0]);
        Assert.assertEquals(blueJay, animals[1]);
        Assert.assertEquals(redRobin, animals[2]);
    }
}
