package com.bridgelabz.day5;

import java.util.Scanner;

public class Distance {
    public static void calculateDistance(int x, int y) {
        double distance = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        System.out.println("Euclidean distance: " + distance);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        calculateDistance(x, y);

    }
}
