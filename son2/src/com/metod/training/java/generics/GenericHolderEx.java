package com.metod.training.java.generics;


public class GenericHolderEx<T, Z, R, M> {

    private T str;
    private Z test;
    private R test2;
    private M test3;


    public T getStr() {
        return this.str;
    }

    public void setStr(final T strParam) {
        this.str = strParam;
    }


    public Z getTest() {
        return this.test;
    }


    public void setTest(final Z testParam) {
        this.test = testParam;
    }


    public R getTest2() {
        return this.test2;
    }


    public void setTest2(final R test2Param) {
        this.test2 = test2Param;
    }


    public M getTest3() {
        return this.test3;
    }


    public void setTest3(final M test3Param) {
        this.test3 = test3Param;
    }


}
