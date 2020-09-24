package com.metod.training.java.interfaces;


public class MyImplV3 implements IMyInterface, MySecondInterface {

    @Override
    public String execute(final String strParam,
                          final int aParam) {
        return "Hello world V3 " + strParam + " " + aParam;
    }

    @Override
    public String process(final long bParam) {
        return "Test V3 " + bParam;
    }

}
