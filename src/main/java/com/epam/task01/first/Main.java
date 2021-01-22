package com.epam.task01.first;


import com.epam.task01.first.enteties.Array;
import com.epam.task01.first.view.ArrayPrinter;
import com.epam.task01.first.view.ConsoleArrayPrinter;

public class Main {
    public static void main(String[] args) {




        Array array = new Array();
        ArrayPrinter arrayPrinter = new ConsoleArrayPrinter();
        arrayPrinter.print(array);
    }
}