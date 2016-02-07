package com.putracode.guava.collections;

import com.google.common.collect.ArrayTable;
import com.google.common.collect.Lists;
import com.google.common.collect.Table;

import java.util.ArrayList;
import java.util.List;
import static com.putracode.guava.Util.*;
/**
 * Created by KrisnaPutra on 2/7/2016.
 */
public class GuavaArrayTable {
    public static void main(String[] args) {
        //Create Row Table
        List<Integer> rowsTable= Lists.newArrayList(1,2);
        //Create Column Table
        List<String> columnsTables=Lists.newArrayList("First Name","Last Name","Age");

       //ArrayTable is Fix Rows And Columns
        Table<Integer,String,Object> studentTable=ArrayTable.create(rowsTable,columnsTables);
        //Row One
        studentTable.put(1,"First Name",new String("Krisna"));
        studentTable.put(1,"Last Name",new String("Putra"));
        studentTable.put(1,"Age",new Integer(28));
        //Row Two
        studentTable.put(2,"First Name",new String("Dira"));
        studentTable.put(2,"Last Name",new String("Safitri"));
        studentTable.put(2,"Age",new Integer(25));

        printTitle("Google Guava : Arrays Table");
        println("Select * from Student Table : "+studentTable);
        println("Select * from Student Table Where Row=1 -->"+studentTable.row(1));
        println("Select First Name from Student Table where Row=2 -->"+studentTable.get(2,"First Name"));


    }
}
