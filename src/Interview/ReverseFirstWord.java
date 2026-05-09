//package Interview;
//
//ublic class ReverseFirstWord {
//
//
//    public static void main(String[] args) {
//
//        String str = "Welcome to Java";
//
//        String[] words = str.split(" ");
//
//        char[] firstWord = words[0].toCharArray();
//
//        int left = 0;
//        int right = firstWord.length - 1;
//
//        // reverse first word
//        while (left < right) {
//            char temp = firstWord[left];
//            firstWord[left] = firstWord[right];
//            firstWord[right] = temp;
//
//            left++;
//            right--;
//        }
//
//// replace reversed word
//        words[0] = new String(firstWord);
//
//        // join back sentence
//        String result = String.join(" ", words);
//
//        System.out.println(result);
