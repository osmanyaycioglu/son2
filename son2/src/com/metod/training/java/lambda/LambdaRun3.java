package com.metod.training.java.lambda;


public class LambdaRun3 {

    public static void main(final String[] args) {
        String name = "osman";

        IThirdIntf t3 = () -> "Hello world " + name;

        System.out.println(t3.process());
    }
}
