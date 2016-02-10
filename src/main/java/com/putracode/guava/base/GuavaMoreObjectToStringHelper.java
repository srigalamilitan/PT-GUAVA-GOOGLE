package com.putracode.guava.base;

import com.google.common.base.MoreObjects;
import com.putracode.guava.pojo.Student;

import static com.putracode.guava.Util.*;
import java.util.Date;

/**
 * Created by KrisnaPutra on 2/10/2016.
 */
public class GuavaMoreObjectToStringHelper {
    public static void main(String[] args) {

        Student student=findDummyStudent();

        printTitle("Google Guava : How To Use MoreObjects ");
        println("Print Object to String (Guava) "+student);


    }
    public static Student findDummyStudent(){
        Student student =new Student();
        student.setId(123L);
        student.setFirstName("Krisna");
        student.setLastName("Putra");
        student.setBirtOfDate(new Date());
        student.setGrades(3.3f);
        return  student;
    }
}
