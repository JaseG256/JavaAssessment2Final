package com.zipcodewilmington.assessment2.part2;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ArrayUtilityTest {
    private ArrayUtility utility;

    @Before
    public void setup(){
        utility = new ArrayUtility();
    }

    @Test
    public void testMerge_withOneElement(){
        //Given
        Integer[] array1 = {9};
        Integer[] array2 = {6};
        Integer[] expected = {9, 6};

        //When
        Integer[] actual = utility.merge(array1, array2);

        //Then
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void testMerge_withMultipleElements(){
        //Given
        Integer[] array1 = {5, 1, 8};
        Integer[] array2 = {4, 2};
        Integer[] expected = {5, 1, 8, 4, 2};

        //When
        Integer[] actual = utility.merge(array1, array2);

        //Then
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void testRotateLeft_forOne(){
        //Given
        Integer[] array = {5, 1, 8, 4, 2};
        Integer[] expected = {1, 8, 4, 2, 5};

        //When
        Integer[] actual = utility.rotate(array, 1);

        //Then
        Assert.assertArrayEquals(expected, actual);
    }
//
//    @Test
//    public void testRotateLeft_forMoreThanOne(){
//        //Given
//        Integer[] array = {5, 1, 8, 4, 2};
//        Integer[] expected = {4, 2, 5, 1, 8,};
//
//        //When
//        Integer[] actual = utility.rotate(array, 3);
//
//        //Then
//        Assert.assertArrayEquals(expected, actual);
//    }
//
    @Test
    public void countOccurrence_whenValueDoesNotExist() {
        // Given
        Integer valueToEvaluate = 7;
        Integer expected = 0;
        Integer[] array1 = {1, 6};
        Integer[] array2 = {9, 8, 11};

        // When
        Integer actual = utility.countOccurrance(array1, array2, valueToEvaluate);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void countOccurrence_whenValueExistInFirstArray() {
        // Given
        Integer valueToEvaluate = 7;
        Integer expected = 1;
        Integer[] array1 = {1, 6, valueToEvaluate};
        Integer[] array2 = {3};

        // When
        Integer actual = utility.countOccurrance(array1, array2, valueToEvaluate);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void countOccurrence_whenValueExistInSecondArray() {
        // Given
        Integer valueToEvaluate = 9;
        Integer expected = 2;
        Integer[] array1 = {1, 6};
        Integer[] array2 = {valueToEvaluate, valueToEvaluate, 3};

        // When
        Integer actual = utility.countOccurrance(array1, array2, valueToEvaluate);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void countOccurrence_whenValueAppearsInBoth() {
        // Given
        Integer valueToEvaluate = 7;
        Integer expected = 7;
        Integer[] array1 = {valueToEvaluate, 1, valueToEvaluate, 8, 84, 5, valueToEvaluate, 9, 8, valueToEvaluate};
        Integer[] array2 = {1, valueToEvaluate, valueToEvaluate, 8, 5, valueToEvaluate, 91};

        // When
        Integer actual = utility.countOccurrance(array1, array2, valueToEvaluate);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testMostCommon_withOnlyOneElement(){
        //Given
        Integer[] array = {5};
        Integer expected = 5;

        //When
        Integer actual = utility.mostCommon(array);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testMostCommon_withMultipleElements(){
        //Given
        Integer commonValue = 8;
        Integer[] array = {commonValue, 5, 1, 1, commonValue, 5, 5, commonValue, commonValue};

        //When
        Integer actual = utility.mostCommon(array);

        //Then
        Assert.assertEquals(commonValue, actual);
    }
}
