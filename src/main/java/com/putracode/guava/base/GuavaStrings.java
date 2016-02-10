package com.putracode.guava.base;
import com.google.common.base.Strings;

import static com.putracode.guava.Util.*;
/**
 * Created by KrisnaPutra on 2/10/2016.
 */
public class GuavaStrings {
    public static void main(String[] args) {
        final String STR_NULL=null;
        final String STR_EMPTY="";
        final String STRING="STRING";

        printTitle("Google Guava : Strings");
        printlnSubTitle("1. emptyToNull");
        printlnTab("How To Return String Empty When Null -->"+ Strings.nullToEmpty(STR_NULL)+"<--");
        endPrintTab();

        printlnSubTitle("2. emptyToNull");
        printlnTab("How To Return null Value When String Empty -->"+Strings.emptyToNull(STR_EMPTY));
        endPrintTab();

        printlnSubTitle("3. Check String Empty Or Null");
        printlnTab("String Null  : " + Strings.isNullOrEmpty(STR_NULL));
        printlnTab("String Empty : "+ Strings.isNullOrEmpty(STR_EMPTY));
        printlnTab("Check String Empty Or Null : "+Strings.isNullOrEmpty(STRING));
        endPrintTab();

        printlnSubTitle("4. padEnd and padStart");
        printlnTab("String padEnd 12 : "+ Strings.padEnd(STRING,12,'0'));
        printlnTab("String padStart 12 : "+Strings.padStart(STRING, 12, '0'));
        endPrintTab();

        printlnSubTitle("5. Repeat ");
        printlnTab("Repeat String 2x : "+Strings.repeat(STRING,2));
        endPrintTab();

        printlnSubTitle("6. Common Prefix and Common Sufix");
        printlnTab("CommonPrefix [STR123,STR321] is : "+Strings.commonPrefix("STR123","STR321"));
        printlnTab("CommonSufix ["+Strings.padEnd(STRING,12,'0')
                                +","+Strings.padEnd("123123",12,'0')+ "] is : "
                                +Strings.commonSuffix(Strings.padEnd(STRING,12,'0'),Strings.padEnd("123123",12,'0')));
    }
}
