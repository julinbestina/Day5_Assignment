package com.bridgelabz.day5;

import java.util.Scanner;

public class HarmonicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Harmonic value: ");
        int harmonicValue = sc.nextInt();
        float harmonic = 1;

        for( int i = 2; i <= harmonicValue; i++) {
            harmonic +=  (float) 1 / i;
        }

        System.out.println("Nth Harmonic value = " + harmonic);
    }
}
