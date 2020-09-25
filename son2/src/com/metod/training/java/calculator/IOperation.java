package com.metod.training.java.calculator;

import java.util.function.BiFunction;
import java.util.function.Supplier;


public interface IOperation<T, U, R> {

    Supplier<String> menuStr();

    BiFunction<T, U, R> operation();
}
