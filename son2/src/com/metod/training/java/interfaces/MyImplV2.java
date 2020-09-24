package com.metod.training.java.interfaces;


public class MyImplV2 implements IMyInterface, MySecondInterface {

    @Override
    public String execute(final String strParam,
                          final int aParam) {
        return "Hello world V2 " + strParam + " " + aParam;
    }

    @Override
    public String process(final long bParam) {
        return "Test V2 " + bParam;
    }

}
