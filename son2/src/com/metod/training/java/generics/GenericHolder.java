package com.metod.training.java.generics;


public class GenericHolder<T> {

    private T str;

    public T getStr() {
        return this.str;
    }

    public void setStr(final T strParam) {
        this.str = strParam;
    }

}
