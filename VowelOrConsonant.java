package com.bridgelabz.day5;

import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        char[] vowel = {'a', 'e', 'i', 'o', 'u'};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Alphabet: ");
        char alphabet = sc.next().charAt(0);
        boolean isVowel = false;

        for( int i = 0; i < vowel.length; i++) {
            if (Character.toLowerCase(alphabet) == vowel[i]) {
                 isVowel = true;
            }
        }
        
        if(isVowel) {
            System.out.println(alphabet + " is a Vowel");
        }
        else {
                System.out.println(alphabet + " is a Consonant" );
            }

    }
}
