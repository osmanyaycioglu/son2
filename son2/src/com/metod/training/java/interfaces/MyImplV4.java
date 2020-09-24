package com.metod.training.java.interfaces;


public class MyImplV4 implements IMyInterface, MySecondInterface {

    @Override
    public String execute(final String strParam,
                          final int aParam) {
        return "Hello world V4 " + strParam + " " + aParam;
    }

    @Override
    public String process(final long bParam) {
        return "Test V4 " + bParam;
    }

}
