package com.metod.training.java.interfaces;


public class MyInterfaceFactory {

    public static IMyInterface createMyInterface(final int index) {
        switch (index) {
            case 1:
                return new MyImpl();
            case 2:
                return new MyImplV2();
            case 3:
                return new MyImplV3();
            case 4:
                return new MyImplV4();

            default:
                return new MyImpl();
        }
    }
}
