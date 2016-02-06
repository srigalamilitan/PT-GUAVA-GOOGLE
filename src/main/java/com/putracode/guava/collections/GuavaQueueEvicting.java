package com.putracode.guava.collections;

import com.google.common.collect.EvictingQueue;
import com.google.common.collect.Queues;
import static com.putracode.guava.Util.*;
import java.util.Queue;

/**
 * Created by KrisnaPutra on 2/7/2016.
 */
public class GuavaQueueEvicting {
    public static void main(String[] args) {
        printTitle("TEST EVICTING QUEUE");
        testEvictingQueue();
    }

    public static void testEvictingQueue(){
        Queue<String> evictingQueue= EvictingQueue.create(10);
        String message="This Is Evicting Queue ";
        try {
            for (int i = 1; i <= 15; i++) {
                evictingQueue.add(message + i);
                println("EvictingQueue size: " + evictingQueue.size());
            }
        } catch (Exception e) {
            println("Exception Occurred: " + e);
        }

        printTitle("Poll Queue Evicting");
        while(!evictingQueue.isEmpty()){
            println(evictingQueue.poll());
        }

    }
}
