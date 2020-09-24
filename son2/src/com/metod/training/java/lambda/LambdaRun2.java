package com.metod.training.java.lambda;

import java.util.function.Consumer;

public class LambdaRun2 {

    public static void main(final String[] args) {
        LambdaRun2.run((z,
                        q,
                        w) -> z + " " + q + " " + w);
        LambdaRun2.run((z,
                        q,
                        w) -> q + " " + w + " " + z);
        LambdaRun2.run((z,
                        q,
                        w) -> q + " " + w + " " + z.toUpperCase());

        Consumer<String> csr = dfg -> System.out.println(dfg);
        Consumer<String> csr2 = System.out::println;

        Consumer<Integer> csri = h -> System.out.println(100 * h);
        csr.accept("osman");
        csr2.accept("osman");
        csri.accept(10);

    }

    public static void run(final ISecondLambdaIntf sc) {
        String abcLoc = sc.abc("osman",
                               100,
                               19L);
        System.out.println("sonuc : " + abcLoc);


    }

}
