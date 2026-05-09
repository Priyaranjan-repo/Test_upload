package interview1;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;

public class MergeIntervalsJava8 {

    public static void main(String[] args) {
        int[][] intervals = { {1,3}, {2,6}, {8,10}, {15,18} };
        int[][] merged = merge(intervals);

        System.out.println("Merged Intervals:");
        Arrays.stream(merged)
              .map(Arrays::toString)
              .forEach(System.out::println);
    }

    public static int[][] merge(int[][] intervals) {
        if (intervals == null || intervals.length <= 1) {
            return intervals;
        }

        // Sort intervals using Java 8 Comparator
        List<int[]> sortedIntervals = Arrays.stream(intervals)
                .sorted(Comparator.comparingInt(a -> a[0]))
                .collect(Collectors.toList());

        List<int[]> result = new ArrayList<>();
        int[] current = sortedIntervals.get(0);

        for (int i = 1; i < sortedIntervals.size(); i++) {
            int[] next = sortedIntervals.get(i);
            if (current[1] >= next[0]) {
                // Merge
                current[1] = Math.max(current[1], next[1]);
            } else {
                result.add(current);
                current = next;
            }
        }

        result.add(current); // Add the last merged interval
        return result.toArray(new int[result.size()][]);
    }
}
