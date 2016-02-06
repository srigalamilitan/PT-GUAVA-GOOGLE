package com.putracode.guava;

/**
 * Created by KrisnaPutra on 2/5/2016.
 */
public  class Util {
    public static final String HEADER_PRINT="*********************************************";
    public static void print(String s){
        System.out.print(s);
    }
    public static void println(String s){
        System.out.println(s);
    }
    public static void printTitle(String s){
        println(HEADER_PRINT);
        println(s);
        println(HEADER_PRINT);

    }
}
