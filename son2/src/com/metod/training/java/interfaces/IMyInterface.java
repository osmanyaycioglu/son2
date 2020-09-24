package com.metod.training.java.interfaces;


public interface IMyInterface {

    public static int ABC = 100;

    String execute(String str,
                   int a);

    public static void testStatic() {
        System.out.println("static interface test");
    }

    default void showResult(final String str) {
        String executeLoc = this.execute(str,
                                         IMyInterface.ABC);
        System.out.println(executeLoc);
    }
}
