package com.putracode.guava.base;
import com.google.common.base.Joiner;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.List;
import java.util.Map;

import static com.putracode.guava.Util.*;
/**
 * Created by KrisnaPutra on 2/8/2016.
 *
 */
public class GuavaJoiner {
/*
    An object which joins pieces of text (specified as an array, Iterable, varargs or even a Map) with a separator.
    It either appends the results to an Appendable or returns them as a String.

*/
    public static void main(String[] args) throws  Exception{
        printTitle("Google Guava : Joiner");
        //Example How to Use Google Guava Joiner
        // List Joiner
        List<String> listOfName= Lists.newArrayList("SrigalaMilitan", "Krisna", "Dirra", "Nagita", null, null);
        String joinSkipNulls= Joiner.on("#")//method for automatically places separator between consecutive elements.
                .skipNulls()//automatically skipping over any provided null elements.
                .join(listOfName);
        printlnSubTitle("How to User Joiner With List");
        printlnTab("Joiner Skip Null Of List : " + joinSkipNulls);
        // Replace Null use mehtod useForNull
        String joinReplaceIfNullValue= Joiner.on("#")//method for automatically places separator
                // between consecutive elements.
                .useForNull("VALUE_IS_MISSING")//automatically substituting nullText for any provided null elements.
                .join(listOfName);
        printlnTab("Joiner Replace Value If Null : " + joinReplaceIfNullValue);
        endPrintTab();

        /*
            Example Google Guava for Classes that implement Appendeable Interface
         */

        File file = File.createTempFile("guava","study");
        FileWriter fileWriter = new FileWriter(file);

        Joiner.on(";")
                .useForNull("N/A")
                .appendTo(fileWriter, listOfName);
        fileWriter.close();

        FileReader fileReader = new FileReader(file);
        BufferedReader reader = new BufferedReader(fileReader);
        String csvLine = reader.readLine();
        reader.close();
        printlnSubTitle("Example Google Guava for Classes that implement Appendeable Interface");
        printlnTab("From Text File : "+csvLine);
        file.delete();
        endPrintTab();

        printlnSubTitle("Example Joiner with Map ");
        Map<String,String> map = Maps.newHashMap();
        map.put("Krisna", "Father");
        map.put("Dirra", "Mother");
        map.put("Gita", "Children");

        String joined = Joiner.on("#")
                .withKeyValueSeparator("=") //Returns a MapJoiner using the given key-value separator,
                        // and the same configuration as this Joiner otherwise.
                .join(map);
        printlnTab("Joiner with Map : "+joined);
        endPrintTab();
    }
}
