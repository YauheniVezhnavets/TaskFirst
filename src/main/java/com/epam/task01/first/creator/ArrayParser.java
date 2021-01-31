package com.epam.task01.first.creator;

import com.epam.task01.first.enteties.Array;

import java.util.ArrayList;
import java.util.List;


public class ArrayParser {

    private static final String SPLIT_SEPARATOR = " ";


    public Array <Integer> parse (String data){

        String [] strings = data.split(SPLIT_SEPARATOR);
        List <Integer> parsedArray = new ArrayList<Integer>();

        for (String string: strings){
            Integer integer =  Integer.parseInt(string);
            parsedArray.add(integer);
        }

        return new Array<Integer>(parsedArray);
    }
}
