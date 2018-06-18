package com.zipcodewilmington.assessment2.part2;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ListUtilitiyTest {
    private ListUtility utility;

    @Before
    public void setup(){
        utility = new ListUtility();
    }

    @Test
    public void testAdd(){
        boolean actual = utility.add(5);

        Assert.assertTrue(actual);
    }

    @Test
    public void testSize_whenThereIsNoElement(){
        int expectedSize = 0;
        int actualSize = utility.size();

        Assert.assertEquals(expectedSize, actualSize);
    }

    @Test
    public void testSize_afterAdd(){
        utility.add(1);
        utility.add(4);

        int expectedSize = 2;
        int actualSize = utility.size();

        Assert.assertEquals(expectedSize, actualSize);
    }

    @Test
    public void testUnique_forOneElement(){
        int value = 3;
        List<Integer> expected = new ArrayList<>();
        expected.add(value);

        utility.add(value);

        List<Integer> actual = utility.getUnique();

        assertListEquals(expected, actual);
    }

    @Test
    public void testUnique_whenOneElementRepeats(){
        int value = 9;
        List<Integer> expected = new ArrayList<>();
        expected.add(value);

        utility.add(value);
        utility.add(value);

        List<Integer> actual = utility.getUnique();

        assertListEquals(expected, actual);
    }

    @Test
    public void testUnique_whenMultipleElementRepeats(){
        int value = 9;
        int value2 = 18;
        int value3 = 15;
        List<Integer> expected = new ArrayList<>();
        expected.add(value);
        expected.add(value2);
        expected.add(value3);

        utility.add(value);
        utility.add(value2);
        utility.add(value);
        utility.add(value2);
        utility.add(value2);
        utility.add(value3);


        List<Integer> actual = utility.getUnique();

        assertListEquals(expected, actual);
    }

    @Test
    public void testJoin_withOneElement(){
        utility.add(812);
        String expected = "812";

        String actual = utility.join();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testJoin_withMultipleElement(){
        utility.add(8);
        utility.add(7);
        utility.add(9);
        utility.add(71);
        String expected = "8, 7, 9, 71";

        String actual = utility.join();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testMostCommon_withOnlyOneElement(){
        //Given
        Integer expectedValue = 5;
        utility.add(expectedValue);

        //When
        Integer actual = utility.mostCommon();

        //Then
        Assert.assertEquals(expectedValue, actual);
    }

    private void assertListEquals(List<Integer> expected, List<Integer> actual) {
        if (expected.size() != actual.size()) {
            Assert.fail();
        }

        for(int i = 0; i < expected.size(); i++) {
            Integer expectedI = expected.get(i);
            Integer actualI = actual.get(i);

            Assert.assertEquals(expectedI, actualI);
        }
    }

}
