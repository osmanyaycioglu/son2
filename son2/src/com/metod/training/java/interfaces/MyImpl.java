package com.metod.training.java.interfaces;


public class MyImpl implements IMyInterface, MySecondInterface {

    @Override
    public String execute(final String strParam,
                          final int aParam) {
        return "Hello world " + strParam + " " + aParam;
    }

    @Override
    public String process(final long bParam) {
        return "Test " + bParam;
    }

}
