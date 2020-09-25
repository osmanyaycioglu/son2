package com.metod.training.java.calculator;

import java.util.Scanner;

public class Calc {

    public static void main(final String[] args) {
        Scanner sc = null;
        try {
            sc = new Scanner(System.in);
            System.out.println("seçiminiz : ");
            int nextIntLoc = sc.nextInt();
            System.out.println(nextIntLoc);
        } catch (NullPointerException eLoc) {
            eLoc.printStackTrace();
        } catch (IllegalArgumentException eLoc) {
            eLoc.printStackTrace();
        } catch (Exception eLoc) {
            eLoc.printStackTrace();
        } finally {
            if (sc != null) {
                sc.close();
            }
        }

        try (Scanner sc2 = new Scanner(System.in)) {
            System.out.println("1-toplama : ");
            System.out.println("2-çıkarma : ");
            System.out.println("seçiminiz : ");
            int nextIntLoc = sc2.nextInt();
            System.out.println("ilk girdi : ");
            int ilkLoc = sc2.nextInt();
            System.out.println("ikinci girdi : ");
            int ikinciLoc = sc2.nextInt();

        } catch (NullPointerException | IllegalArgumentException eLoc) {
            eLoc.printStackTrace();
        } catch (Exception eLoc) {
            eLoc.printStackTrace();
        }
    }
}
