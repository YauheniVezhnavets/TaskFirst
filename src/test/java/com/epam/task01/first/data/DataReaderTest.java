package com.epam.task01.first.data;

import com.epam.task01.first.enteties.Array;
import org.junit.Assert;
import org.junit.Test;


import java.util.Arrays;
import java.util.List;


public class DataReaderTest {

    //given
    public  final static String TEST_DATA = "./src/test/resources/input.txt";
    public  final static String NO_FILE = "./src/test/resources/input";
    private final DataReader reader = new DataReader();

    @Test
    public void testReadDataShouldReadLineWhenFilenameIsCorrect() throws DataException {


        //when
        List<String> actual = reader.readData(TEST_DATA);
        List<String> expected = Arrays.asList("1 3 5", "10 30 45");

        //then
        Assert.assertEquals(expected, actual);
    }

    @Test (expected = DataException.class)
    public void testReadDataShouldThrowDataExceptionWhenFileIsNotFound() throws DataException {

        //when
        List<String> actual = reader.readData(NO_FILE);

    }

}
