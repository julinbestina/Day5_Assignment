package com.bridgelabz.day5;

import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();

        System.out.println("power of 2");

        if( range >= 0 && range < 31 ) {
            for( int i = 0; i <= range; i++) {
                System.out.println("2 Power " + i + " is :" + (int)Math.pow(2, i));
            }
        }

    }
}
