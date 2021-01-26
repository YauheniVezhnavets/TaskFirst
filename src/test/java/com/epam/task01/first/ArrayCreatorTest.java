package com.epam.task01.first;


import com.epam.task01.first.ArrayCreator;
import com.epam.task01.first.creator.ArrayParser;
import com.epam.task01.first.creator.ArrayValidator;
import com.epam.task01.first.data.DataException;
import com.epam.task01.first.data.DataReader;
import com.epam.task01.first.enteties.Array;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.when;

public class ArrayCreatorTest {

    public final static List<String> TEST_DATA = Arrays.asList("1 3 5", "10 30 45");

    @Test
    public void testCreateShouldCreateArrayWhenFileHaveCorrectData() throws DataException {

        DataReader reader = Mockito.mock(DataReader.class);
        when(reader.readData(anyString())).thenReturn(TEST_DATA);

        ArrayValidator validator = Mockito.mock(ArrayValidator.class);
        when(validator.validate(anyString())).thenReturn(true);

        ArrayParser parser = Mockito.mock(ArrayParser.class);
        when(parser.parse("1 3 5")).thenReturn(new Array<Integer>(1, 3, 5));


      //  when(parser.parse("2d 7")).thenReturn());


        when(parser.parse("10 30 45")).thenReturn(new Array<Integer>(10, 30, 45));


        ArrayCreator arrayCreator = new ArrayCreator(reader, validator, parser);

        List<Array<Integer>> actual = arrayCreator.create("");
        List<Array<Integer>> expected = new ArrayList<Array<Integer>>();

        expected.add(new Array(1, 3, 5));
        expected.add(new Array(10, 30, 45));


        Assert.assertEquals(expected, actual);
    }
}
