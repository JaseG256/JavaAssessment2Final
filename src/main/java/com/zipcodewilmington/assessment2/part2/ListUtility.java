package com.zipcodewilmington.assessment2.part2;

import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class ListUtility {

    private List<Integer> myList;

    public ListUtility() {
        myList = new ArrayList<>();
    }

    public boolean add(Integer number) {
        boolean isAdded = false;
        if (myList.add(number)){
            isAdded = true;
        }
        return isAdded;
    }

    public int size() {
        int sizeOfMyList = myList.size();
        return sizeOfMyList;
    }

    public List<Integer> getUnique() {
        //Set<Integer> setFromList = new HashSet<>(myList);
        List<Integer> uniqueList = myList.stream().distinct().collect(Collectors.toList());
        return uniqueList;
    }

    public String join() {
        String joinedList = "";
        for (Integer integer : myList) {
            joinedList += integer.toString() + ", ";
        }
        return joinedList.substring(0, joinedList.length() - 2);
    }

    public Integer mostCommon() {
        int size = myList.size();
        int count = 0;
        int maxCount = 0;
        Integer element = myList.get(0);
        Integer mostOccuringElement = element;

        for(int index = 0; index<size; index++) {
            if(myList.get(index).equals(element)) {
                count++;
                if(count > maxCount) {
                    maxCount = count;
                    mostOccuringElement = element;
                }
            } else {
                count = 1;
            }
            element = myList.get(index);
        }
        return mostOccuringElement;
    }
}
