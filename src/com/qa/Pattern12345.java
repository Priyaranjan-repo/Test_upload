package com.qa;

public class Pattern12345 {
    public static void main(String[] args) {
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i > j)
                    System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}