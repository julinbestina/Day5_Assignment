package com.bridgelabz.day5;

import java.util.Scanner;

public class PrimeFactors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number to find its prime factors: ");
        int number = sc.nextInt();

        while (number % 2 == 0) {
            System.out.print(2 + " ");
            number /= 2;
        }

        for (int i = 3; i * i < number; i += 2) {
            while (number % i == 0) {
                System.out.print(i + " ");
                number /= i;
            }
        }

        if (number > 2) {
            System.out.print(number);
        }

    }
}


