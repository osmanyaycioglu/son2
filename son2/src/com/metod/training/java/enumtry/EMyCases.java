package com.metod.training.java.enumtry;


public enum EMyCases {

    CASE_TEST_RUNTIME(10, "Test 1"),
    CASE_TEST_PREPROD(11, "Test 2"),
    CASE_TEST_LIVE(12, "Test 3"),
    CASE_TEST_TEST(13, "Test 4");

    private final int    value;
    private final String str;

    private EMyCases(final int value,
                     final String str) {
        this.value = value;
        this.str = str;
    }

    public void testCiktisi() {
        System.out.println(this.str);
    }
}
