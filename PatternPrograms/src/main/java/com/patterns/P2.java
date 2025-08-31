package com.patterns;

import java.util.Scanner;

public class P2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the row of Box : ");
        int row = scanner.nextInt();
        System.out.println("Enter the column of Box : ");
        int col = scanner.nextInt();
        System.out.println("Enter the no. of boxes : ");
        int boxs = scanner.nextInt();

        int c = col * boxs;
        for (int i = 0; i < row; i++) {

            for (int j = 0; j < c; j++) {
                boolean printStar = false;
                if (i == 0 || i == row - 1 || j == 0 || j == c - 1) {
                    System.out.print(" * ");
                    printStar = true;
                }
                if (!printStar) {
                    for (int k = 1; k <= boxs; k++) {
                        if (j == col * k - 1 || j == col * k) {
                            System.out.print(" * ");
                            printStar = true;
                            break;
                        }
                    }
                }
                if (!printStar) {
                    System.out.print("   ");
                }
            }
            System.out.println();

        }
    }
}
