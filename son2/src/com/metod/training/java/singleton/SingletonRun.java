package com.metod.training.java.singleton;


public class SingletonRun {

    public static void main(final String[] args) {
        EagerSingleton instanceLoc = EagerSingleton.getInstance();
        instanceLoc.hello();

        LazySingleton lazySingletonLoc = LazySingleton.getInstance();
        lazySingletonLoc.hello();

        EnumSingleton.INSTANCE.hello();
    }
}
