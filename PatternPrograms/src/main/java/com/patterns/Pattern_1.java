package com.patterns;

import java.util.Scanner;

public class Pattern_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns...");
        int r = sc.nextInt();
        int c = sc.nextInt();

        aman(r, c);
        for (int i = 2; i <= r; i++) {
            for (int j = c; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void aman(int r, int c) {
        for (int i = r; i >= 1; i--) {

            for (int j = c; j >= i; j--) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }


            System.out.println();
        }
    }
}
