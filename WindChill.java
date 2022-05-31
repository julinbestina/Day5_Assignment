package com.bridgelabz.day5;

import java.util.Scanner;

public class WindChill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temperature :");
        double t = sc.nextDouble();
        System.out.println("Enter the Wind Speed:");
        double v = sc.nextDouble();
        calculateWindChill(t, v);
    }

    public static void calculateWindChill(double t, double v) {
        if ((t < 50) && (v > 3) && (v < 120)) {
            double w = 35.74 + (0.6215 * t) + ((0.4275 * t) - 35.75) * (Math.pow(v, 0.16));
            System.out.println("Wind Chill: " + w);
        }
    }
}
