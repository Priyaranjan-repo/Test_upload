package Interview;
import java.util.HashSet;
import java.util.Set;

public class FindDuplicateMissing {

    public static void main(String[] args) {

        int arr[] = {1,2,3,5,3};

        Set<Integer> set = new HashSet<>();
        int duplicate = -1;
        int missing = -1;

        for(int num : arr) {
            if(set.contains(num)) {
                duplicate = num;
            }
            set.add(num);
        }

        for(int i=1;i<=arr.length;i++) {
            if(!set.contains(i)) {
                missing = i;
            }
        }

        System.out.println("Duplicate Number: " + duplicate);
        System.out.println("Missing Number: " + missing);
    }
}