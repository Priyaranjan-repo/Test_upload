package com.softwaretestingo.javaprograms;

public class Program25 {

    public static void main(String[] args) {

        /*
         * Input ( 1,2,3,4,5 )
         *
         * Output- { 3,4,5,1,2 }
         */

        int a[] = {1, 2, 3, 4, 5};

        for (int i = 0; i < a.length; i++) {
            
        	if (i <= a.length / 2) {
                System.out.print(a[a.length / 2 + i]+" ");
            } else {
                System.out.print(a[a.length / 2 - a.length + i]+ " ");
            }
        }
    }

}
