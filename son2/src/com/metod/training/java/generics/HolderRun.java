package com.metod.training.java.generics;

import java.math.BigDecimal;

import com.metod.training.java.Person;

public class HolderRun {

    public static void main(final String[] args) {
        StringHolder holderLoc = new StringHolder();
        holderLoc.setStr("osman");
        String strLoc = holderLoc.getStr();


        ObjectHolder objectHolderLoc = new ObjectHolder();
        objectHolderLoc.setStr(BigDecimal.ONE);
        objectHolderLoc.setStr(100);
        objectHolderLoc.setStr(Person.createPersonVer2("osman",
                                                       strLoc,
                                                       strLoc,
                                                       strLoc));
        Object str3Loc = objectHolderLoc.getStr();
        if (str3Loc instanceof BigDecimal) {
            BigDecimal str2Loc = (BigDecimal) objectHolderLoc.getStr();
        } else if (str3Loc instanceof Person) {
            Person per = (Person) objectHolderLoc.getStr();
        }

        GenericHolder<String> strGenericHolderLoc = new GenericHolder<>();
        strGenericHolderLoc.setStr("osman");
        String str2Loc = strGenericHolderLoc.getStr();

        GenericHolder<Integer> intGenericHolderLoc = new GenericHolder<>();
        intGenericHolderLoc.setStr(100);
        Integer str4Loc = intGenericHolderLoc.getStr();

        GenericHolder<Person> personGenericHolderLoc = new GenericHolder<>();
        personGenericHolderLoc.setStr(Person.createPersonVer2(str2Loc,
                                                              str2Loc,
                                                              strLoc,
                                                              str2Loc));
        Person str5Loc = personGenericHolderLoc.getStr();

        GenericHolderEx<String, Integer, Person, String> complex = new GenericHolderEx<>();
    }
}

