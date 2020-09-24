package com.metod.training.java;

import java.util.logging.Level;
import java.util.logging.Logger;

public class FirstRun {

    public static void main(final String[] args) {
        int a = 100;
        int b = 100;
        if (a == b) {
            System.out.println("int eşit");
        }
        Person per1 = new Person("osman",
                                 "yaycioglu");

        Person per2 = new Person("osman",
                                 "yaycioglu");
        if (per1 == per2) {
            System.out.println("per1 == per2 eşit");
        }

        if (per1.equals(per2)) {
            System.out.println("per1.equals(per2) eşit");
        }


        System.out.println("Hello");
        String strLoc1 = "osman";
        String strLoc3 = new String("osman");
        String strLoc2 = "osman";
        if (strLoc1 == strLoc2) {
            System.out.println("1 2 ye eşit");
        }
        if (strLoc1 == strLoc3) {
            System.out.println("1 3 e eşit");
        }

        if (strLoc1.equals(strLoc3)) {
            System.out.println("1 3 e equals eşit");
        }

        strLoc1 += " yaycioglu";

        Person per3 = new Person("ali",
                                 "veli");

        System.out.println(strLoc1 + " " + per3);

        String strnew1 = "deneme " + strLoc1 + " " + per1 + " new  " + per3;
        strnew1 += "xyz";

        StringBuilder strBuilderLoc = new StringBuilder(100_000);
        long delta = System.currentTimeMillis();
        for (int iLoc = 0; iLoc < 10_000; iLoc++) {
            strBuilderLoc.append(" ")
                         .append(iLoc);
        }
        System.out.println("StringBuilder add Delta : " + (System.currentTimeMillis() - delta));

        String strnew2 = "deneme ";

        delta = System.currentTimeMillis();
        for (int iLoc = 0; iLoc < 10_000; iLoc++) {
            strnew2 += " " + iLoc;
        }
        System.out.println("String add Delta : " + (System.currentTimeMillis() - delta));

        delta = System.currentTimeMillis();
        for (int iLoc = 0; iLoc < 10_000; iLoc++) {
            String test1 = String.format("osman %s deneme %d %d",
                                         "yaycioglu",
                                         iLoc,
                                         iLoc + 10);
        }
        System.out.println("String format Delta : " + (System.currentTimeMillis() - delta));

        delta = System.currentTimeMillis();
        for (int iLoc = 0; iLoc < 10_000; iLoc++) {
            String test1 = "osman " + "yaycioglu" + " deneme " + iLoc + (iLoc + 10);
        }
        System.out.println("String concat Delta : " + (System.currentTimeMillis() - delta));

        Logger loggerLoc = Logger.getLogger("test");
        if (loggerLoc.isLoggable(Level.FINER)) {
            loggerLoc.finest("osman " + "yaycioglu" + " deneme " + 10);
        }

    }

}
