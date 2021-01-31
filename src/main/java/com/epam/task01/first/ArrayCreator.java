package com.epam.task01.first;


import com.epam.task01.first.creator.ArrayParser;
import com.epam.task01.first.creator.ArrayValidator;
import com.epam.task01.first.data.DataException;
import com.epam.task01.first.data.DataReader;
import com.epam.task01.first.enteties.Array;


import java.util.ArrayList;
import java.util.List;

public class ArrayCreator {

    private DataReader dataReader;
    private ArrayValidator arrayValidator;
    private ArrayParser arrayParser;


    public ArrayCreator(DataReader dataReader, ArrayValidator arrayValidator, ArrayParser arrayParser) {
        this.dataReader = dataReader;
        this.arrayValidator = arrayValidator;
        this.arrayParser = arrayParser;
    }

    public List <Array<Integer>> create (String filename) throws DataException {

        List <String> stringLines = dataReader.readData(filename);
        List <Array <Integer>> arrayOfInteger = new ArrayList<Array<Integer>>();

        for (String stringLine : stringLines ) {
            if (arrayValidator.validate(stringLine)){
                Array <Integer> array = arrayParser.parse(stringLine);
                arrayOfInteger.add(array);
            }
        }
        return arrayOfInteger;
    }
}
