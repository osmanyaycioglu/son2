package com.metod.training.java.calculator;

import java.util.ArrayList;
import java.util.List;

public class OperationFactory2 {

    public static List<IOperation<Integer, Integer, String>> getOperations() {
        List<IOperation<Integer, Integer, String>> allOp = new ArrayList<>();
        allOp.add(new Operation(() -> "Toplama",
                                (a,
                                 b) -> "" + (a + b)));
        allOp.add(new Operation(() -> "Çıkarma",
                                (a,
                                 b) -> "" + (a - b)));
        allOp.add(new Operation(() -> "Çarpma",
                                (a,
                                 b) -> "" + (a * b)));
        allOp.add(new Operation(() -> "Bölme",
                                (a,
                                 b) -> b == 0 ? "NAN" : ("" + (a / b))));

        allOp.add(new Operation(() -> "Log",
                                (a,
                                 b) -> b == 0 ? "NAN" : ("" + (a / b))));
        allOp.add(new Operation(() -> "abc",
                                (a,
                                 b) -> b == 0 ? "NAN" : ("" + (a / b))));
        return allOp;
    }


}
