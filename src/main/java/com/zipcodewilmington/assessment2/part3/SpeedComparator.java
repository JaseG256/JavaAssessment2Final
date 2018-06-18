package com.zipcodewilmington.assessment2.part3;

import java.util.Comparator;

public class SpeedComparator implements Comparator<Animal> {
    @Override
    public int compare(Animal animalOne, Animal animalTwo) {
        int comparison;
        if (animalOne.getSpeed() == animalTwo.getSpeed()) {
            comparison = 0;
        } else if (animalOne.getSpeed() < animalTwo.getSpeed()) {
            comparison = 1;
        } else {
            comparison = -1;
        }
        return comparison;
    }
}
