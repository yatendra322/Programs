package com.repeatPatterns;

import java.util.Scanner;

public class RP_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns...");
        int r = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("Enter the number of repeating...");
        int repeat = sc.nextInt();


        for (int i = r; i >= 1; i--) {

            aaaa(c, repeat, i);
        }

        for (int i = 2; i <= r; i++) {
            aaaa(c, repeat, i);
        }
    }

    private static void aaaa(int c, int repeat, int i) {
        for (int col = 1; col <= repeat; col++) {

            for (int j = c - 1; j >= i; j--) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            for (int j = c - 1; j >= i; j--) {
                System.out.print(" ");
            }
        }

        System.out.println();
    }
}
