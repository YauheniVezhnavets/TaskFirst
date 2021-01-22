package com.epam.task01.first.logic;


import com.epam.task01.first.enteties.Array;

public class ArrayLogic {

        //method find max Value
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

    //method find min Value
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

    //method change negative value for positive (- for +)
    public Array changeValueOfArrayElements (Array array){
        if (array.getElements().size() == 0) {
            throw new IllegalArgumentException("Array is empty");
        }
        for (int i=0; i<array.getElements().size();i++) {
            int value = array.getElements().get(i);
            if (array.getElements().get(i) < 0) {
                value -= 2*value;
                array.getElements().set(i, value);
            }
        }
        return array;
    }

    //method calculate average value
    public double findAverageValue(Array array) {

        if (array.getElements().size() == 0) {
            throw new IllegalArgumentException("Array is empty");
        }
        double average=0;
        for (int element: array.getElements()){
            average+=element;
        }
        return average/ array.getElements().size();
    }

    //method find sum of values
    public int findSumOfValues(Array array) {

        if (array.getElements().size() == 0) {
            throw new IllegalArgumentException("Array is empty");
        }

        int  sum= 0;

        for (int element : array.getElements()){
            sum+=element;
        }
        return sum;
    }

    public int findCountOfPositiveNumber(Array array){
        if (array.getElements().size() == 0) {
            throw new IllegalArgumentException("Array is empty");
        }

        int countOfPositiveNumber=0;
        for (int element : array.getElements()){
            if (element>0){
                countOfPositiveNumber++;
            }
        }
        return countOfPositiveNumber;
    }
    public int findCountOfNegativeNumber(Array array){
        if (array.getElements().size() == 0) {
            throw new IllegalArgumentException("Array is empty");
        }

        int countOfNegativeNumber=0;
        for (int element : array.getElements()){
            if (element<0){
                countOfNegativeNumber++;
            }
        }
        return countOfNegativeNumber;
    }
}
