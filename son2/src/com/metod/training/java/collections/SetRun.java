package com.metod.training.java.collections;

import java.util.HashSet;
import java.util.Set;

public class SetRun {

    public static void main(final String[] args) {
        Set<String> setLoc = new HashSet<>();
        //Set<String> setLoc = new TreeSet<>();
        setLoc.add("1");
        setLoc.add("2");
        setLoc.add("3");
        setLoc.add("4");
        setLoc.add("5");
        setLoc.add("6");
        for (String stringLoc : setLoc) {
            System.out.println(stringLoc);
        }
        Set<String> setLoc2 = new HashSet<>();
        setLoc2.add("4");
        setLoc2.add("5");
        setLoc2.add("6");
        setLoc2.add("7");
        setLoc2.add("8");
        setLoc2.add("9");

        setLoc.addAll(setLoc2);
        // setLoc.removeAll(setLoc2);
        // setLoc.retainAll(setLoc2);
        System.out.println("----------------");
        for (String stringLoc : setLoc) {
            System.out.println(stringLoc);
        }

        setLoc.contains("3");
    }
}
