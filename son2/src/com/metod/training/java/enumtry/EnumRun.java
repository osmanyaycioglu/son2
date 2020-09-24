package com.metod.training.java.enumtry;


public class EnumRun {

    public static final int    MAX_LOOP_COUNT          = 10;

    public static final int    CASE_TEST_RUNTIME       = 10;
    public static final String CASE_TEST_RUNTIME_DESC  = "Test 3 de oldu";
    public static final String CASE_TEST_RUNTIME_ORGIN = "RUNTIME";

    public static final int    CASE_TEST_PREPROD       = 11;
    public static final int    CASE_TEST_LIVE          = 12;
    public static final int    CASE_TEST_TEST          = 13;

    public static void main(final String[] args) {
        int a = 10;
        if (a == EnumRun.MAX_LOOP_COUNT) {
            for (int iLoc = 0; iLoc < EnumRun.MAX_LOOP_COUNT; iLoc++) {
                System.out.println("Hello : " + iLoc);
            }
        }

        switch (a) {
            case CASE_TEST_RUNTIME:
                System.out.println("Test 1");
                break;
            case CASE_TEST_PREPROD:
                System.out.println("Test 2");
                break;
            case CASE_TEST_LIVE:
                System.out.println("Test 3");
                break;
            case CASE_TEST_TEST:
                System.out.println("Test 4");
                break;
            default:
                System.out.println("Default");
                break;
        }

        EMyCases casesLoc = EMyCases.CASE_TEST_LIVE;
        switch (casesLoc) {
            case CASE_TEST_LIVE:
                System.out.println("Test 3");
                break;
            case CASE_TEST_PREPROD:
                System.out.println("Test 2");
                break;
            case CASE_TEST_RUNTIME:
                System.out.println("Test 1");
                break;
            case CASE_TEST_TEST:
                System.out.println("Test 3");
                break;
            default:
                System.out.println("Default");
                break;

        }

        casesLoc.testCiktisi();

        EMyCases2 casesLoc2 = EMyCases2.CASE_TEST_LIVE;
        casesLoc2.testCiktisi();
    }
}
