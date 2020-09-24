package com.metod.training.java.singleton;


public class SingletonUsage {

    public void name1() {
        LazySingleton.getInstance()
                     .hello();
        this.name2();
    }

    public void name2() {
        LazySingleton.getInstance()
                     .hello();
        this.name3();

    }

    public void name3() {
        LazySingleton.getInstance()
                     .hello();
        this.name4();

    }

    public void name4() {
        LazySingleton.getInstance()
                     .hello();

    }

}
