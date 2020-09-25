package com.metod.training.java.calculator;

import java.util.function.BiFunction;
import java.util.function.Supplier;

public class Operation implements IOperation<Integer, Integer, String> {

    private final Supplier<String>                     menu;
    private final BiFunction<Integer, Integer, String> op;


    public Operation(final Supplier<String> menuParam,
                     final BiFunction<Integer, Integer, String> opParam) {
        super();
        this.menu = menuParam;
        this.op = opParam;
    }

    @Override
    public Supplier<String> menuStr() {
        return this.menu;
    }

    @Override
    public BiFunction<Integer, Integer, String> operation() {
        return this.op;
    }

}
