package com.metod.training.java.singleton;


public class EagerSingleton {

    private static EagerSingleton eagerSingleton = new EagerSingleton();

    private EagerSingleton() {
    }

    public static EagerSingleton getInstance() {
        return EagerSingleton.eagerSingleton;
    }

    public void hello() {
        System.out.println("Hello world");
    }
}
