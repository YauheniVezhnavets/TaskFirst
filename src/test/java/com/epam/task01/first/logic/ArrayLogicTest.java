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

        //then
        Assert.assertEquals(3, actual);
    }

    @Test
    public void testFindMaxShouldFindMaxWhenNegativeNumbersApplied() {
        //given
        Array array = new Array(-1, -3, -2);

        //when
        int actual = arrayLogic.findMax(array);

        //then
        Assert.assertEquals(-1, actual);
    }

    @Test
    public void testFindMaxShouldFindMaxWhenAllMeansSimilar() {
        //given
        Array array = new Array(3, 3, 3);

        //when
        int actual = arrayLogic.findMax(array);

        //then
        Assert.assertEquals(3, actual);

    }

    @Test
    public void testFindMaxShouldFindMaxWhenAllMeansZero() {
        //given
        Array array = new Array(0, 0, 0);

        //when
        int actual = arrayLogic.findMax(array);

        //then
        Assert.assertEquals(0, actual);

    }

    @Test
    public void testFindMaxShouldFindMaxWhenArrayHaveOnlyOneElement() {
        //given
        Array array = new Array(5);

        //when
        int actual = arrayLogic.findMax(array);

        //then
        Assert.assertEquals(5, actual);

    }


    @Test
    public void testFindMinShouldFindMinWhenPositiveNumbersApplied() {
        //given
        Array array = new Array(1, 3, 2);

        //when
        int actual = arrayLogic.findMin(array);

        //then
        Assert.assertEquals(1, actual);
    }

    @Test
    public void testFindMinShouldFindMinWhenNegativeNumbersApplied() {
        //given
        Array array = new Array(-1, -3, -2);

        //when
        int actual = arrayLogic.findMin(array);

        //then
        Assert.assertEquals(-3, actual);
    }

    @Test
    public void testFindMinShouldFindMinWhenAllMeansSimilar() {
        //given
        Array array = new Array(3, 3, 3);

        //when
        int actual = arrayLogic.findMin(array);

        //then
        Assert.assertEquals(3, actual);

    }

    @Test
    public void testFindMinShouldFindMinWhenAllMeansZero() {
        //given
        Array array = new Array(0, 0, 0);

        //when
        int actual = arrayLogic.findMin(array);

        //then
        Assert.assertEquals(0, actual);

    }

    @Test
    public void testFindMinShouldFindMinWhenArrayHaveOnlyOneElement() {
        //given
        Array array = new Array(1);

        //when
        int actual = arrayLogic.findMin(array);

        //then
        Assert.assertEquals(1, actual);

    }

    @Test
    public void testChangeValueOfArrayElementsShouldDoNothingWhenNumbersPositive() {
        //given
        Array array = new Array(1, 5, 7);

        //when
        Array actual = arrayLogic.changeValueOfArrayElements(array);

        //then
        Assert.assertEquals(array, actual);
    }

    @Test
    public void testChangeValueOfArrayElementsShouldDoNothingWhenNumbersZero() {
        //given
        Array array = new Array(0, 0, 0);

        //when
        Array actual = arrayLogic.changeValueOfArrayElements(array);

        //then
        Assert.assertEquals(array, actual);
    }

    @Test
    public void testChangeValueOfArrayElementsShouldChangeForPositiveWhenNumbersNegative() {
        //given
        Array array = new Array(-2, -4, -8);
        Array arrayChanged = new Array(2, 4, 8);

        //when
        Array actual = arrayLogic.changeValueOfArrayElements(array);

        //then
        int count = 0;
        for (int i = 0; i < actual.getElements().size(); i++) {
            Assert.assertEquals(arrayChanged.getElements().get(i), actual.getElements().get(i));
        }
    }

    @Test
    public void testFindAverageValueShouldFindAverageValueWhenArrayHaveOnlyOneElement() {
        //given
        Array array = new Array(6);

        //when
        double actual = arrayLogic.findAverageValue(array);

        //then
        Assert.assertEquals(6, actual, 0);

    }

    @Test
    public void testFindAverageValueShouldFindAverageValueWhenArrayHaveOnlyPositiveNumber() {
        //given
        Array array = new Array(6,4,3,1);

        //when
        double actual = arrayLogic.findAverageValue(array);

        //then
        Assert.assertEquals(3, actual, 0.5);

    }

    @Test
    public void testFindAverageValueShouldFindAverageValueWhenArrayHaveOnlyNegativeNumber() {
        //given
        Array array = new Array(-2,-3,-4,-1);

        //when
        double actual = arrayLogic.findAverageValue(array);

        //then
        Assert.assertEquals(-2, actual, 0.5);

    }
    @Test
    public void testFindAverageValueShouldFindAverageValueWhenArrayHavePositiveAndNegativeNumber() {
        //given
        Array array = new Array(2,-3,4,-1);

        //when
        double actual = arrayLogic.findAverageValue(array);

        //then
        Assert.assertEquals(0, actual, 0.5);

    }
    @Test
    public void testFindAverageValueShouldFindAverageValueWhenArrayHaveOnlyZero() {
        //given
        Array array = new Array(0,0,0,0);

        //when
        double actual = arrayLogic.findAverageValue(array);

        //then
        Assert.assertEquals(0, actual, 0);
    }
    @Test
    public void testFindSumOfValuesShouldFindSumOfElementsWhenPositiveNumbersApplied() {
        //given
        Array array = new Array(1, 3, 2);

        //when
        int actual = arrayLogic.findSumOfValues(array);

        //then
        Assert.assertEquals(6, actual);
    }
    @Test
    public void testFindSumOfValuesShouldFindSumOfElementsWhenNegativeNumbersApplied() {
        //given
        Array array = new Array(-1, -4, -7);

        //when
        int actual = arrayLogic.findSumOfValues(array);

        //then
        Assert.assertEquals(-12, actual);
    }
    @Test
    public void testFindSumOfValuesShouldFindSumOfElementsWhenArrayHaveOnlyZeroValue() {
        //given
        Array array = new Array(0, 0, 0);

        //when
        int actual = arrayLogic.findSumOfValues(array);

        //then
        Assert.assertEquals(0, actual);
    }
    @Test
    public void testFindSumOfValuesShouldFindSumOfElementsWhenArrayHavePositiveAndNegativeAndZeroElements() {
        //given
        Array array = new Array(3, -2, 4, 0, -1);

        //when
        int actual = arrayLogic.findSumOfValues(array);

        //then
        Assert.assertEquals(4, actual);
    }
    @Test
    public void testFindCountOfNegativeNumbersShouldFindCountOfNegativeNumbersWhenArrayHavePositiveAndZeroNumbers() {
        //given
        Array array = new Array(3, 1, 4, 0, 1);

        //when
        int actual = arrayLogic.findCountOfNegativeNumber(array);

        //then
        Assert.assertEquals(0, actual);
    }
    @Test
    public void testFindCountOfNegativeNumbersShouldFindCountOfNegativeNumbersWhenArrayHaveOnlyZeroNumbers() {
        //given
        Array array = new Array(0,0,0);

        //when
        int actual = arrayLogic.findCountOfNegativeNumber(array);

        //then
        Assert.assertEquals(0, actual);
    }
    @Test
    public void testFindCountOfNegativeNumbersShouldFindCountOfNegativeNumbersWhenArrayHaveOnlyNegativeNumbers() {
        //given
        Array array = new Array(-4,-2,-1);

        //when
        int actual = arrayLogic.findCountOfNegativeNumber(array);

        //then
        Assert.assertEquals(3, actual);
    }
    @Test
    public void testFindCountOfNegativeNumbersShouldFindCountOfNegativeNumbersWhenArrayHavePositiveNegativeAndZeroNumbers() {
        //given
        Array array = new Array(-1,2,0,-6,4);

        //when
        int actual = arrayLogic.findCountOfNegativeNumber(array);

        //then
        Assert.assertEquals(2, actual);
    }
    @Test
    public void testFindCountOfPositiveNumbersShouldFindCountOfPositiveNumbersWhenArrayHaveNegativeAndZeroNumbers() {
        //given
        Array array = new Array(-2, -1, -4, 0, -1);

        //when
        int actual = arrayLogic.findCountOfPositiveNumber(array);

        //then
        Assert.assertEquals(0, actual);
    }
    @Test
    public void testFindCountOfPositiveNumbersShouldFindCountOfPositiveNumbersWhenArrayHaveOnlyZero() {
        //given
        Array array = new Array(0,0,0);

        //when
        int actual = arrayLogic.findCountOfPositiveNumber(array);

        //then
        Assert.assertEquals(0, actual);
    }
    @Test
    public void testFindCountOfPositiveNumbersShouldFindCountOfPositiveNumbersWhenArrayHaveOnlyPositiveNumbers() {
        //given
        Array array = new Array(4,2,1);

        //when
        int actual = arrayLogic.findCountOfPositiveNumber(array);

        //then
        Assert.assertEquals(3, actual);
    }
    @Test
    public void testFindCountOfPositiveNumbersShouldFindCountOfPositiveNumbersWhenArrayHavePositiveNegativeAndZeroNumbers() {
        //given
        Array array = new Array(-1,2,0,-6,4);

        //when
        int actual = arrayLogic.findCountOfPositiveNumber(array);

        //then
        Assert.assertEquals(2, actual);
    }
}
