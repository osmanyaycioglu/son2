package com.metod.training.java.annotations;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionRun {

    public static void main(final String[] args) {
        MyAnnoUse annoUseLoc = new MyAnnoUse();
        annoUseLoc.setAbc("testosman");
        annoUseLoc.setXyz("gotosdjkhf");

        Customer customerLoc = new Customer();
        customerLoc.setName("osman");
        customerLoc.setSurname("yaycıoğlu");
        customerLoc.setDeparment("dep-it");

        // Validation
        if ((customerLoc.getName()
                        .length() < 5)
            || (customerLoc.getName()
                           .length() > 100)) {
            System.out.println("error");
        }

        try {
            checkValidationAnnotations(annoUseLoc);
            checkValidationAnnotations(customerLoc);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    public static void checkValidationAnnotations(final Object obj) throws IllegalArgumentException, IllegalAccessException {
        Class<?> clazz = obj.getClass();
        Field[] declaredFieldsLoc = clazz.getDeclaredFields();
        for (Field fieldLoc : declaredFieldsLoc) {
            System.out.println("Field : " + fieldLoc.getName());
            checkMyAnno(obj,
                        fieldLoc);
            checkSize(obj,
                      fieldLoc);
        }
        Method[] declaredMethodsLoc = clazz.getDeclaredMethods();
        for (Method methodLoc : declaredMethodsLoc) {
            System.out.println("Method : " + methodLoc.getName());
        }
    }

    private static void checkMyAnno(final Object obj,
                                    final Field fieldLoc) throws IllegalAccessException {
        MyFirstAnno annotationLoc = fieldLoc.getAnnotation(MyFirstAnno.class);
        if (annotationLoc != null) {
            String startLoc = annotationLoc.start();
            int indexLoc = annotationLoc.index();
            Class<?> typeLoc = fieldLoc.getType();
            if (String.class == typeLoc) {
                fieldLoc.setAccessible(true);
                String objectLoc = (String) fieldLoc.get(obj);
                if (!objectLoc.startsWith(startLoc)) {
                    throw new IllegalArgumentException("MyFirstAnno patladı : "
                                                       + fieldLoc.getName()
                                                       + " "
                                                       + startLoc
                                                       + " ile başlamalı.");
                }
            }
        }
    }

    private static void checkSize(final Object obj,
                                  final Field fieldLoc) throws IllegalAccessException {
        ValidateSize annotationLoc = fieldLoc.getAnnotation(ValidateSize.class);
        if (annotationLoc != null) {
            int min = annotationLoc.min();
            int max = annotationLoc.max();
            Class<?> typeLoc = fieldLoc.getType();
            if (String.class == typeLoc) {
                fieldLoc.setAccessible(true);
                String objectLoc = (String) fieldLoc.get(obj);
                if ((objectLoc.length() < min) || (objectLoc.length() > max)) {
                    throw new IllegalArgumentException("Size validation error : "
                                                       + fieldLoc.getName()
                                                       + " string must be between "
                                                       + min
                                                       + " - "
                                                       + max);
                }
            }
        }
    }

}
