package com.metod.training.java.collections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class QueueRun {

    public static void main(final String[] args) {
        Queue<String> stringQueue = new LinkedList<>();
        stringQueue.add("osman1");
        stringQueue.add("osman2");

        String pollLoc = stringQueue.poll();
        System.out.println("Poll 1 : " + pollLoc);

        pollLoc = stringQueue.poll();
        System.out.println("Poll 2 : " + pollLoc);

        pollLoc = stringQueue.poll();
        System.out.println("Poll 3 : " + pollLoc);


        BlockingQueue<String> bQueue = new ArrayBlockingQueue<>(1000);
        bQueue.add("1");
        bQueue.add("2");

        try {
            String takeLoc = bQueue.take();
            takeLoc = bQueue.take();
            takeLoc = bQueue.take();

        } catch (Exception e) {
            e.printStackTrace();
        }

        Deque<String> dequeue = new ArrayDeque<>(100);

    }
}
