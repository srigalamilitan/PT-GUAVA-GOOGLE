package com.putracode.guava.base;
import com.google.common.base.CharMatcher;

import static com.putracode.guava.Util.*;
/**
 * Created by KrisnaPutra on 2/7/2016.
 */
public class GuavaCharMatcher {
    public static void main(String[] args) {
        printTitle("Google Guava ChatMatcher");

        printlnSubTitle("Google Guava : Get Only DIGIT Or Letter Only");
        String data= "123123This Is Letter$%^&*()_12312";
        printlnTab("Data : "+data);
        printlnTab("Get Digit From Data  : "+ CharMatcher.digit().retainFrom(data));
        printlnTab("Get Letter From Data : " + CharMatcher.javaLetter().or(CharMatcher.WHITESPACE).retainFrom(data));
        endPrintTab();


        printlnSubTitle("Google Guava : Remove All Upper Case and Lower Case");
        data = "THIS IS UPPER CASE story of my code by www.putracode.com";
        printlnTab("Data : "+data);
        printlnTab("Remove All Upper Case : " + CharMatcher.JAVA_UPPER_CASE.removeFrom(data));
        printlnTab("Remove All Lower Case : " + CharMatcher.JAVA_LOWER_CASE.removeFrom(data));
        endPrintTab();

        printlnSubTitle("Google Guava : Count Matching Char");
        data = "www.putracode.com awesome 123465";
        printlnTab("Data : "+data);
        printlnTab("Count Matching Char Digit :"+CharMatcher.digit().countIn(data));
        printlnTab("Count Matching Char \"w\" : " + CharMatcher.javaLetter().is('w').countIn(data));
        endPrintTab();

        printlnSubTitle("Google Guava : Range Checker");
        printlnTab("Range \'A\' to \'J\' for Char \'X\'" + CharMatcher.inRange('A','J').apply('X'));
        printlnTab("Range \'A\' to \'J\' for Char \'E\'" + CharMatcher.inRange('A','J').apply('E'));
        endPrintTab();

    }
}
