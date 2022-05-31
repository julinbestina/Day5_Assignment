package com.bridgelabz.day5;

import java.util.Scanner;

public class Quadratic {
    public static void findRoots(int a, int b, int c) {
        int delta = (b * b) - (4 * a * c);
        if( delta > 0) {
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("The roots of the Quadratic Equation is: " + root1 + "," + root2);
        }
        else if( delta == 0) {
            double root = -b / (2 * a);
            System.out.println("The root is: " + root);
        }
        System.out.println("Roots are not real");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Co-efficients a, b, c :");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        findRoots( a, b, c);
    }
}





