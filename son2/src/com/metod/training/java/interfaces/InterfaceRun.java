package com.metod.training.java.interfaces;

import java.util.Scanner;

public class InterfaceRun {

    public static void main(final String[] args) {
        Scanner scannerLoc = new Scanner(System.in);
        System.out.println("Seçiminiz : ");
        int nextIntLoc = scannerLoc.nextInt();
        InterfaceRun runLoc = new InterfaceRun();
        runLoc.run(nextIntLoc);
    }

    public void run(final int index) {
        IMyInterface ref = MyInterfaceFactory.createMyInterface(index);
        String executeLoc = ref.execute("osman",
                                        10);
        System.out.println(executeLoc);
        MySecondInterface seconRef = (MySecondInterface) ref;
        String processLoc = seconRef.process(100L);
        System.out.println(processLoc);
    }

    public void run2(final int index) {
        switch (index) {
            case 1: {
                MyImpl myImplLoc = new MyImpl();
                String executeLoc = myImplLoc.execute("osman",
                                                      10);
                System.out.println(executeLoc);
            }
                break;
            case 2: {
                MyImplV2 myImplLoc = new MyImplV2();
                String executeLoc = myImplLoc.execute("osman",
                                                      10);
                System.out.println(executeLoc);
            }
                break;
            case 3: {
                MyImplV3 myImplLoc = new MyImplV3();
                String executeLoc = myImplLoc.execute("osman",
                                                      10);
                System.out.println(executeLoc);
            }
                break;
            case 4: {
                MyImplV4 myImplLoc = new MyImplV4();
                String executeLoc = myImplLoc.execute("osman",
                                                      10);
                System.out.println(executeLoc);
            }
                break;
            default:
                break;
        }
    }

}
