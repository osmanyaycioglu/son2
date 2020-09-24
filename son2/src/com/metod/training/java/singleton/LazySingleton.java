package com.metod.training.java.singleton;


public class LazySingleton {

    private static volatile LazySingleton eagerSingleton;

    private LazySingleton() {
    }

    public static LazySingleton getInstance() {
        if (LazySingleton.eagerSingleton == null) {
            synchronized (LazySingleton.class) {
                if (LazySingleton.eagerSingleton == null) {
                    LazySingleton.eagerSingleton = new LazySingleton();
                }
            }
        }
        return LazySingleton.eagerSingleton;
    }

    public void hello() {
        System.out.println("Hello world");
    }
}
