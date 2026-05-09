package Interview;

public class Reverse1stWord1 {


    public static void main(String[] args) {

        String str = "Welcome to Java";

        String[] words = str.split(" ");

        String rev = "";
        String first = words[0];
        for (int i = first.length()-1; i >= 0; i--) {
            rev += first.charAt(i);
        }

words[0]=rev;
        String result = String.join(" ",words);

        System.out.println(result);

    }
    }
