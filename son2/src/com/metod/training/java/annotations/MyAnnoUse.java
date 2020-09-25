package com.metod.training.java.annotations;


public class MyAnnoUse {

    @MyFirstAnno(start = "test")
    private String abc;

    @MyFirstAnno(start = "goto")
    private String xyz;

    public String getAbc() {
        return this.abc;
    }


    public void setAbc(final String abcParam) {
        this.abc = abcParam;
    }


    public String getXyz() {
        return this.xyz;
    }


    public void setXyz(final String xyzParam) {
        this.xyz = xyzParam;
    }


}
