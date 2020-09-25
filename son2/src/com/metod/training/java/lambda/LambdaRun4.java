package com.metod.training.java.lambda;

import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaRun4 {

    public static void main(final String[] args) {
        Function<String, Integer> convertInt = o -> Integer.parseInt(o);
        int sonuc = 10 * convertInt.apply("1000");
        System.out.println("Sonuç : " + sonuc);


        BiFunction<String, Integer, Long> convertAndProcessInt = (a,
                                                                  c) -> (long) (Integer.parseInt(a) * c);
        System.out.println("Sonuç : "
                           + convertAndProcessInt.apply("13",
                                                        15));

        Predicate<String> sPredicateLoc = f -> f.startsWith("osman");
        if (sPredicateLoc.test("osman yaycıoğlu")) {
            System.out.println("Evet osman la başlıyor");
        }

        BiPredicate<String, Integer> checkStr = (u,
                                                 i) -> Integer.parseInt(u) == i;

        if (checkStr.test("1000",
                          1000)) {
            System.out.println("Evet eşit");
        }

        Supplier<String> strSupplierLoc = () -> "osman";

    }
}
