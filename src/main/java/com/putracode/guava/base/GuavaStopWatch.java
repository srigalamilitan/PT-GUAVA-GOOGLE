package com.putracode.guava.base;
import com.google.common.base.Stopwatch;

import java.util.concurrent.TimeUnit;

import static com.putracode.guava.Util.*;
/**
 * Created by KrisnaPutra on 2/7/2016.
 */
public class GuavaStopWatch {
    public static void main(String[] args) {
        printTitle("StopWatch Start ");
        int countingDown=10;
        Stopwatch stopwatch=Stopwatch.createUnstarted();
        stopwatch.elapsed(TimeUnit.SECONDS);
        stopwatch.start();
        while(countingDown>0){
            try {
                Thread.sleep(1000);
            }catch (Exception e){
                println(e.getMessage());
            }
            println("StopWatch Is Running ? --> "+stopwatch.isRunning());
            println("StopWatch Time is "+stopwatch);
            countingDown--;
        }
        printTitle("End Of Looping");
        println("Check Total Time is Needed: "+stopwatch);
        stopwatch.stop();

    }
}
