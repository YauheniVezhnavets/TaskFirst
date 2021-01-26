package com.epam.task01.first.creator;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ArrayValidator {


    public boolean validate (String line) {

        Pattern pattern = Pattern.compile("^(\\d+\\s)*\\d+$");
        Matcher matcher =pattern.matcher(line);

       return  matcher.matches();

    }
}
