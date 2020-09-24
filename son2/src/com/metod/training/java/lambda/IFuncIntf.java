package com.metod.training.java.lambda;


@FunctionalInterface
public interface IFuncIntf {

    String execute(String str);

    default void showDefault() {
        System.out.println(this.execute("default"));
    }

}
