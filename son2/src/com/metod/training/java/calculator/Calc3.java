package com.metod.training.java.calculator;

import java.util.List;
import java.util.Scanner;

public class Calc3 {

    public static void main(final String[] args) {
        try (Scanner sc2 = new Scanner(System.in)) {
            List<IOperation<Integer, Integer, String>> operationsLoc = OperationFactory2.getOperations();
            for (int iLoc = 0; iLoc < operationsLoc.size(); iLoc++) {
                IOperation<Integer, Integer, String> iOperationLoc = operationsLoc.get(iLoc);
                System.out.println((iLoc + 1)
                                   + "-"
                                   + iOperationLoc.menuStr()
                                                  .get());
            }
            System.out.println("seçiminiz : ");
            int nextIntLoc = sc2.nextInt();
            IOperation<Integer, Integer, String> iOperationLoc = operationsLoc.get(nextIntLoc - 1);
            if (iOperationLoc == null) {
                System.out.println("not valid");
                return;
            }
            System.out.println("ilk girdi : ");
            int ilkLoc = sc2.nextInt();
            System.out.println("ikinci girdi : ");
            int ikinciLoc = sc2.nextInt();
            System.out.println("Sonuç : "
                               + iOperationLoc.operation()
                                              .apply(ilkLoc,
                                                     ikinciLoc));
        } catch (NullPointerException | IllegalArgumentException eLoc) {
            eLoc.printStackTrace();
        } catch (Exception eLoc) {
            eLoc.printStackTrace();
        }
    }
}
