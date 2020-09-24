package com.metod.training.java.lambda;

import com.metod.training.java.Person;

public class LambdaRun {

    public static void main(final String[] args) {

        int a = 100;

        Person personLoc = Person.createPersonVer2("osman",
                                                   "yay",
                                                   "myemail@os.com",
                                                   "2389479823");


        IFuncIntf funcIntfLoc = new IFuncIntf() {

            @Override
            public String execute(final String strParam) {
                String emailLoc = personLoc.getEmail();
                return "Hello " + strParam + " " + emailLoc;
            }
        };

        IFuncIntf funcIntfLoc2 = new IFuncIntf() {

            @Override
            public String execute(final String strParam) {
                return "Hello " + strParam + " " + a;
            }
        };

        funcIntfLoc.execute("osman");

        IFuncIntf ftd = b -> {
            String emailLoc = personLoc.getEmail();
            return "Hello " + b + " " + emailLoc;
        };

        IFuncIntf ftd2 = b -> "Hello " + b + " " + personLoc.getEmail();

        IFuncIntf ftd3 = LambdaRun::xyz;

        System.out.println(ftd.execute("osman"));
        System.out.println(ftd2.execute("osman"));
        System.out.println(ftd3.execute("osman"));

    }

    public static String xyz(final String str) {
        return "Hello " + str;
    }

}
