package com.metod.training.java;

import java.util.Date;

public class CreateObject {

    public static void main(final String[] args) {
        // Creating mandatory param object
        Person personLoc1 = new Person("osman",
                                       "yaycioglu");

        Person personLoc3 = Person.createPersonVer2("osman",
                                                    "osman",
                                                    "yaycioglu",
                                                    "5435022313");

        // Creating optional param object
        Person personLoc2 = new Person("osman",
                                       "osman",
                                       "yaycioglu",
                                       "5435022313",
                                       "xyz",
                                       null,
                                       new Date());

        PersonV2 pv2 = PersonV2.getBuilder()
                               .name("osman")
                               .surname("yay")
                               .email("os@os.com")
                               .phone("81276378126")
                               .buildV1();

        PersonV3 personV3Loc = new PersonV3().setName("o")
                                             .setSurname("y")
                                             .setEmail("e")
                                             .setPhone("123123");

    }
}
