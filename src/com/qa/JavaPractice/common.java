package com.qa.JavaPractice;

import java.util.HashSet;

public class common {

	public static void main(String[] args) {

		int array1[] = { 3, 6, 5, 1, 5, 6, 4 };
		int array2[] = { 1, 5, 6, 9, 2, 7, 4 };

		commonArray(array1, array2);
	}

	public static int commonArray(int[] a1, int[] a2) {

		HashSet<Integer> hs = new HashSet<>();// to strore array elemets

		for (int num : a1) {
			hs.add(num);
		}

		System.out.println("common elemets");

		for (int common : a2) {
			if (hs.contains(common)) {
				System.out.println(common + " ");
			}
		}
		return a2.length;
	}
}


/*import java.util.HashSet;
import java.util.Set;

public class UniqueElements {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {4, 5, 6, 7, 8};

        Set<Integer> uniqueElements = findUniqueElements(array1, array2);

        System.out.println("Unique elements between the two arrays: " + uniqueElements);
    }

    public static Set<Integer> findUniqueElements(int[] array1, int[] array2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int num : array1) {
            set1.add(num);
        }

        for (int num : array2) {
            set2.add(num);
        }

        // Find elements that are unique to each set
        Set<Integer> uniqueElements = new HashSet<>(set1);
        uniqueElements.addAll(set2);
        Set<Integer> commonElements = new HashSet<>(set1);
        commonElements.retainAll(set2);
        uniqueElements.removeAll(commonElements);

        return uniqueElements;
    }
}
```
