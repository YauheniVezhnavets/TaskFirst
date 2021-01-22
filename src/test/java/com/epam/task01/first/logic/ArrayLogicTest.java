package com.epam.task01.first.logic;


import com.epam.task01.first.enteties.Array;
import org.junit.Assert;
import org.junit.Test;

public class ArrayLogicTest {
    private ArrayLogic arrayLogic = new ArrayLogic();

    @Test
    public void testFindMaxShouldFindMaxWhenPositiveNumbersApplied() {
        //given
        Array array = new Array(1, 3, 2);

        //when
        int actual = arrayLogic.findMax(array);

        ///then
        Assert.assertEquals(3, actual);
    }

    @Test
    public void testFindMaxShouldFindMaxWhenNegativeNumbersApplied() {
        //given
        Array array = new Array(-1, -3, -2);

        //when
        int actual = arrayLogic.findMax(array);

        ///then
        Assert.assertEquals(-1, actual);
    }

    @Test
    public void testFindMaxShouldFindMaxWhenAllMeansSimilar() {
        //given
        Array array = new Array(3, 3, 3);

        //when
        int actual = arrayLogic.findMax(array);

        ///then
        Assert.assertEquals(3, actual);

    }

    @Test
    public void testFindMaxShouldFindMaxWhenAllMeansZero() {
        //given
        Array array = new Array(0, 0, 0);

        //when
        int actual = arrayLogic.findMax(array);

        ///then
        Assert.assertEquals(0, actual);

    }



    @Test
    public void testFindMinShouldFindMinWhenPositiveNumbersApplied() {
        //given
        Array array = new Array(1, 3, 2);

        //when
        int actual = arrayLogic.findMin(array);

        ///then
        Assert.assertEquals(1, actual);
    }

    @Test
    public void testFindMinShouldFindMinWhenNegativeNumbersApplied() {
        //given
        Array array = new Array(-1, -3, -2);

        //when
        int actual = arrayLogic.findMin(array);

        ///then
        Assert.assertEquals(-3, actual);
    }

    @Test
    public void testFindMinShouldFindMinWhenAllMeansSimilar() {
        //given
        Array array = new Array(3, 3, 3);

        //when
        int actual = arrayLogic.findMin(array);

        ///then
        Assert.assertEquals(3, actual);

    }

    @Test
    public void testFindMinShouldFindMinWhenAllMeansZero() {
        //given
        Array array = new Array(0, 0, 0);

        //when
        int actual = arrayLogic.findMin(array);

        ///then
        Assert.assertEquals(0, actual);

    }
}
