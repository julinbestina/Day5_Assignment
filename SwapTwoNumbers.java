package com.bridgelabz.day5;

import java.util.Scanner;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers to swap: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("The numbers before swapping: " + num1 + ", " + num2);
        int temp = 0;
        temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("The numbers after swapping: " + num1 + ", " + num2);
    }
}
