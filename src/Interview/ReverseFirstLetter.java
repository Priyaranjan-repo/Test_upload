package Interview;

public class ReverseFirstLetter {

    public static void main(String[] args) {


        String s = "Arnika smita Das";
        String reve = "";

        String names[] = s.split(" ");
//        reve = new StringBuilder(names[0]).reverse().toString();

        reve=reverMe(names[0]);

        for (int i = 1; i <= names.length - 1; i++) {
            reve += " " + names[i];
        }
        System.out.println("name: " + s);
        System.out.println("Reve: " + reve);
    }

    public static String reverMe(String ip) {
        String reve = "";
        for (int i = 0; i < ip.length(); i++) {
            reve = ip.charAt(i) + reve;
        }
        return reve;
    }
}
