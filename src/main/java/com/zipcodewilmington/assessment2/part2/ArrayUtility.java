package com.zipcodewilmington.assessment2.part2;

public class ArrayUtility {

    public  Integer[] merge(Integer[] array1, Integer[] array2) {
        Integer[] mergedArray = new Integer[array1.length + array2.length];
        System.arraycopy(array1, 0, mergedArray, 0, array1.length);
        System.arraycopy(array2, 0, mergedArray, array1.length, array2.length);
        return mergedArray;
    }

    public Integer[] rotate(Integer[] array, int number) {
        Integer[] rotatedArray = new Integer[array.length];
        for (int i = 0; i < number; i++) {
            leftRotatebyOne(array);
        }
        return rotatedArray;
    }

    public void leftRotatebyOne(Integer array[]) {
        int i;
        int temp = array[0];
        for (i = 0; i < array.length - 1; i++) {
            array[i] = array[i + 1];
            array[i] = temp;
        }
    }

    public Integer countOccurrance(Integer[] arrayOne, Integer[] arrayTwo, Integer valueToCount) {
        int count = 0;
        for (Integer intOne : arrayOne) {
           if (valueToCount == intOne) {
               count += 1;
           }
        }
        for (Integer intTwo : arrayTwo) {
            if (valueToCount == intTwo) {
                count += 1;
            }
        }
        return count;
    }

    public Integer mostCommon(Integer[] array) {
        int count = 1;
        int tempCount;
        int mostCommonElement = array[0];
        int temp = 0;
        for (int i = 0; i < (array.length - 1); i++) {
            temp = array[i];
            tempCount = 0;
            for (int j = 1; j < array.length; j++) {
                if (temp == array[j])
                    tempCount++;
            }
            if (tempCount > count) {
                mostCommonElement = temp;
                count = tempCount;
            }
        }
        return mostCommonElement;
    }
}
