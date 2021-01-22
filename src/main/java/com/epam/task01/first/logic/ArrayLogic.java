package com.epam.task01.first.logic;


import com.epam.task01.first.enteties.Array;

public class ArrayLogic {

    public int findMax(Array array) {

        if (array.getElements().size() == 0) {
            throw new IllegalArgumentException("Array is empty");
        }
        int  maxValue=array.getElements().get(0);

        for (int i=0; i<array.getElements().size();i++){
            if (array.getElements().get(i)> maxValue){
                maxValue=array.getElements().get(i);
            }
        }
        return maxValue;
    }

    public int findMin(Array array) {

        if (array.getElements().size() == 0) {
            throw new IllegalArgumentException("Array is empty");
        }

        int  minValue=array.getElements().get(0);

        for (int i=0; i<array.getElements().size();i++){
            if (array.getElements().get(i)< minValue){
                minValue=array.getElements().get(i);
            }
        }
        return minValue;
    }
}
