package com.putracode.guava.base;
import com.google.common.base.CharMatcher;
import com.google.common.base.Splitter;

import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

import static com.putracode.guava.Util.*;
/**
 * Created by KrisnaPutra on 2/9/2016.
 */
public class GuavaSplitter {
    public static void main(String[] args) {
        printTitle("Google Guava : Splitter");

        //Basic Splitter
        String firstName="Krisna,Dirra,Nagita";
        List<String> splitterBasic=Splitter.on(',')// Returns a splitter that uses the given single-character separator.
                        .splitToList(firstName);

        printlnSubTitle("0.1 Basic Splitter Guava");
        printlnTab("Original Data "+firstName);
        printlnTab("Splitter with char \',\' : "+splitterBasic);
        endPrintTab();

        //TrimResults
        String firstNameUsingWhiteSpaces="   Krisna    ,Dirra    ,         Nagita";
        //trimResults remove whitespace
        List<String> trimResultSpliter=Splitter.on(',')
                .trimResults()// Returns a splitter that behaves equivalently to this splitter,
                              // but automatically removes leading and trailing whitespace
                             //  from each returned substring; equivalent to
                .splitToList(firstNameUsingWhiteSpaces);
        printlnSubTitle("02. Trim Result ");
        printlnTab("Original FirsName Data : "+firstNameUsingWhiteSpaces);
        printlnTab("Split data into List and Trim Whitespace : "+trimResultSpliter);
        endPrintTab();

        //Split String with Patthen
        String firstNameRandomPattern="Krisna|Putra#Dirra.Safitri,Nagita SEPARATOR Wishly";
        List<String> splitterPattern=Splitter.on(Pattern.compile("([|#.,]|SEPARATOR)"))
                .trimResults()
                .splitToList(firstNameRandomPattern);
        printlnSubTitle("03. Random Pattern ");
        printlnTab("Original Random Data : "+firstNameRandomPattern);
        printlnTab("Split data into List : "+splitterPattern);
        endPrintTab();

        //Split Data using ChatMatcher
        String firstNameWithNumber="Krisna1Putra2Dirra3Safitri4Nagita5Wishly";
        List<String> splitWithCharMatcher=
                Splitter.on(CharMatcher.DIGIT)//Returns a splitter that considers any
                                              // single character matched by the
                                             // given CharMatcher to be a separator.
                .splitToList(firstNameWithNumber);
        /**
         * CharMatcher Options***********************************************
         ANY                        ASCII                   DIGIT
         INVISIBLE                  JAVA_DIGIT              JAVA_ISO_CONTROL
         JAVA_LETTER                JAVA_LETTER_OR_DIGIT    JAVA_LOWER_CASE
         JAVA_UPPER_CASE            NONE                    SINGLE_WIDTH
         WHITESPACE
         *******************************************************************/
        printlnSubTitle("04. Splitter with ChatMatcher");
        printlnTab("Original Data with Number: "+firstNameWithNumber);
        printlnTab("Split data into List : "+splitWithCharMatcher);
        endPrintTab();

        //Split Text To Map
        String dataString="Krisna=Putra,Dirra=Safitri,Nagita=Wishly";
        Map<String,String> map=Splitter.on(',').withKeyValueSeparator('=').split(dataString);
        printlnSubTitle("05. Splitter To Map");
        printlnTab("Original Data : "+dataString);
        printlnTab("Map result Of Spliter : "+map);
        endPrintTab();
    }
}
