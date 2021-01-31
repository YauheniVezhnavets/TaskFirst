package com.epam.task01.first.logic;

import com.epam.task01.first.enteties.Array;

import java.util.Arrays;

public class ArraySorter {


    public Array <Integer> sortedByChoice(Array<Integer> array){

        int [] mas = ArraySorter.changeListForArray(array);

        for (int i=0; i<mas.length;i++){
            int max= mas[i];
            int indexMax=i;
            for (int j=i+1; j<mas.length;j++){
                if (max<mas[j]){
                    max=mas[j];
                    indexMax=j;
                }
            }
            mas[indexMax]=mas[i];
            mas[i]=max;
        }
        return (Array<Integer>) Arrays.asList(mas);
    }

    public Array <Integer> sortedByExchange (Array<Integer> array){

        int [] mas = ArraySorter.changeListForArray(array);


        for (int i=0; i<mas.length;i++) {
            for (int j=0;j<mas.length-1;j++) {
                if (mas[j] > mas[j + 1]) {
                    int temp = mas[j];
                    mas[j] = mas[j + 1];
                    mas[j + 1] = temp;
                }
            }
        }
        return (Array<Integer>) Arrays.asList(mas);
    }

    public Array <Integer> sortedByShellMethod (Array<Integer> array) {
        int[] mas = ArraySorter.changeListForArray(array);


        for (int i = 0; i < mas.length - 1; ) {
            if (mas[i] > mas[i + 1]) {
                int temp = mas[i];
                mas[i] = mas[i + 1];
                mas[i + 1] = temp;

                if (i > 0) {
                    i--;
                }
            } else {
                i++;
            }
        }
        return (Array<Integer>) Arrays.asList(mas);
    }




    public static int[] changeListForArray (Array<Integer> array){
        int [] mas = new int [array.getElements().size()];
        int count = 0;

        for (Integer integer: array.getElements()){
            mas[count]=integer;
            count++;
        }
        return mas;
    }
}
