package com.metod.training.java.enumtry;


public enum EMyCases2 {

    CASE_TEST_RUNTIME(10) {

        @Override
        public void testCiktisi() {
            System.out.println("Test 1");
        }
    },
    CASE_TEST_PREPROD(11) {

        @Override
        public void testCiktisi() {
            System.out.println("Test 2");
        }
    },
    CASE_TEST_LIVE(12) {

        @Override
        public void testCiktisi() {
            System.out.println("Test 3");
        }
    },
    CASE_TEST_TEST(13) {

        @Override
        public void testCiktisi() {
            System.out.println("Test 4");
        }
    };

    private final int value;

    private EMyCases2(final int value) {
        this.value = value;

    }

    public void testCiktisi() {
        System.out.println("default");
    }
}
