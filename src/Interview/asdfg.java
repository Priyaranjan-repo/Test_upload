package Interview;

public class asdfg {
    public static void main(String[] args) {

        String s = "aabbcafffccb";
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            int count = 1;
            while (i + 1 < s.length() && s.charAt(i) == s.charAt(i + 1)) {
                count++;
                i++;
            }

            result += s.charAt(i) + "" + count;
        }
        System.out.println(result);
    }

}
