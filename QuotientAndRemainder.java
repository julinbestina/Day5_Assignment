package com.bridgelabz.day5;

import java.util.Scanner;

public class QuotientAndRemainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the dividend: ");
        int dividend = sc.nextInt();
        System.out.print("Enter the divisor: ");
        int divisor = sc.nextInt();

        int quotient = dividend / divisor;
        int remainder = dividend % divisor;

        System.out.println("Quotient for the division = " + quotient);
        System.out.println("Remainder for the division = " + remainder);

    }
}
