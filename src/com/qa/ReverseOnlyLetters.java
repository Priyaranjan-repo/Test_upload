package com.qa;

public class ReverseOnlyLetters {

    public static void main(String[] args) {

        String s = "today110is210my310interview";

        char[] arr = s.toCharArray();

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            // skip digits from left
            if (Character.isDigit(arr[left])) {
                left++;
            }
            // skip digits from right
            else if (Character.isDigit(arr[right])) {
                right--;
            }
            // swap only letters
            else {
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
                right--;
            }
        }

        System.out.println(new String(arr));
    }

}
