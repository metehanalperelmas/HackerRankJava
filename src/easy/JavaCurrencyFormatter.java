package easy;

import java.util.Scanner;

public class JavaCurrencyFormatter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double payment = sc.nextDouble();
        sc.close();
        String us = java.text.NumberFormat.getCurrencyInstance(java.util.Locale.US).format(payment);
        String india = java.text.NumberFormat.getCurrencyInstance(new java.util.Locale("en", "IN")).format(payment);
        String china = java.text.NumberFormat.getCurrencyInstance(java.util.Locale.CHINA).format(payment);
        String france = java.text.NumberFormat.getCurrencyInstance(java.util.Locale.FRANCE).format(payment);
        System.out.println("US: " + us);
        System.out.println("India: Rs." + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
