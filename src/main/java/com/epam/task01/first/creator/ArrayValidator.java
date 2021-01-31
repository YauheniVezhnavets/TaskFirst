package com.epam.task01.first.creator;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ArrayValidator {
    private static final String ARRAY_PATTERN = "^(\\d+\\s)*\\d+$";


    public boolean validate (String line) {

        Pattern pattern = Pattern.compile(ARRAY_PATTERN);
        Matcher matcher =pattern.matcher(line);

       return  matcher.matches();

    }
}
