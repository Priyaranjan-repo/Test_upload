package com.softwaretestingo.javaprograms;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Program26 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        /*
         * Input: [looking, you, handsome, are]
         *
         * Output: [you, are, looking, handsome]
         */

        String ip[] = {"looking", "you", "handsome", "are"};
        List<String> listo = new LinkedList<String>();
        List<String> liste = new LinkedList<String>();

        for (int i = 0; i < ip.length; i++) {
            if (i % 2 == 1) {
                listo.add(ip[i]);
            } else {
                liste.add(ip[i]);
            }
        }
        listo.addAll(liste);
        Object ob[] = listo.toArray();
        System.out.println(Arrays.toString(ob));
    }

}
