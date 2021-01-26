package com.epam.task01.first.creator;

import org.junit.Assert;
import org.junit.Test;

public class ArrayValidatorTest {

    public final ArrayValidator arrayValidator = new ArrayValidator();

    @Test
    public void testValidateShouldValidateWhenCorrectStringApplied(){

        //given
        String correctStringLine = "1 2 3 4 5";


        //when
        boolean actual = arrayValidator.validate(correctStringLine);

        //then
        Assert.assertTrue(actual);
    }


    @Test
    public void testValidateShouldNotValidateWhenStringIsEmpty(){

        //given
        String emptyString = "";


        //when
        boolean actual = arrayValidator.validate(emptyString);

        //then
        Assert.assertFalse(actual);
    }

}
