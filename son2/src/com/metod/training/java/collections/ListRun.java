package com.metod.training.java.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ListRun {

    public static void main(final String[] args) {
        Random randomLoc = new Random();
        List<String> myList = new ArrayList<>();
        for (int iLoc = 0; iLoc < 1_000; iLoc++) {
            myList.add("osman" + randomLoc.nextInt(100));
        }
        Collections.sort(myList);

        List<String> synchronizedListLoc = Collections.synchronizedList(myList);

        for (int iLoc = 0; iLoc < myList.size(); iLoc++) {
            System.out.println(myList.get(iLoc));
        }
        List<String> perfList = new ArrayList<>(1_100_000);
        // List<String> perfList = new LinkedList<>();
        long delta = System.currentTimeMillis();
        for (int iLoc = 0; iLoc < 1_000_000; iLoc++) {
            perfList.add("osman" + iLoc);
        }
        System.out.println("Add Delta : " + (System.currentTimeMillis() - delta));

        delta = System.currentTimeMillis();
        for (int iLoc = 0; iLoc < 10_000; iLoc++) {
            perfList.get(iLoc);
        }
        System.out.println("Get Delta : " + (System.currentTimeMillis() - delta));

        delta = System.currentTimeMillis();
        for (int iLoc = 0; iLoc < 1_000; iLoc++) {
            perfList.remove(0);
        }
        System.out.println("Delete Delta : " + (System.currentTimeMillis() - delta));

        delta = System.currentTimeMillis();
        for (String stringLoc : perfList) {

        }
        System.out.println("Foreach Delta : " + (System.currentTimeMillis() - delta));
    }
}

