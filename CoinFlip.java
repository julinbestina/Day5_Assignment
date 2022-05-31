package com.bridgelabz.day5;

import java.util.Scanner;

public class CoinFlip {
    public static void main(String[] args) {
        int head = 0, tail = 0;
        Scanner sc = new Scanner(System.in);
        int flipCount = sc.nextInt();

        for( int i = 0; i < flipCount; i++) {
            double coin = Math.random();
            System.out.println(coin);
            if( coin < 0.5 )
                tail++;
            else
                head++;
        }

        System.out.println("Percentage of Head = " + (head * 100 / flipCount) + "%");
        System.out.println("Percentage of tail = " + (tail * 100 / flipCount) + "%");
    }
}
