package com.bridgelabz.day5;

import java.util.Scanner;

public class DistinctTriplet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements :");
        int n = sc.nextInt();
        int[] array = new int[n];

        System.out.print("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        findTriplet(array, n);
    }

    public static void findTriplet(int[] array, int n) {
        int count = 0;
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (array[i] + array[j] + array[k] == 0) {
                        System.out.println(array[i] + " " + array[j] + " " + array[k]);
                        count++;
                    }
                }
            }
        }
        System.out.println("Number of Distinct triplet:" + count);
    }
}
