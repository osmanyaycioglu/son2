package com.metod.training.java.annotations;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;


@Retention(RUNTIME)
@Target(FIELD)
public @interface ValidateSize {

    int min();

    int max() default Integer.MAX_VALUE;
}
