import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class FindDuplicates {

    /**
     * Brute-force version using nested loops.
     * Time complexity: O(n^2)
     */
    public static List<Integer> findDuplicatesNestedLoops(List<Integer> l) {
        List<Integer> duplicates = new ArrayList<>();
        int n = l.size();
        for (int i = 0; i < n; i++) {
            int x = l.get(i);
            if (duplicates.contains(x)) continue;

            boolean found = false;
            for (int j = i + 1; j < n; j++) {
                if (l.get(j).equals(x)) {
                    found = true;
                    break;
                }
            }
            if (found) {
                duplicates.add(x);
            }
        }
        return duplicates;
    }

    /**
     * More efficient version using HashSet.
     * Time complexity: O(n), Space complexity: O(n)
     */
    public static List<Integer> findDuplicatesHashing(List<Integer> l) {
        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();
        List<Integer> result = new ArrayList<>();

        for (int x : l) {
            if (seen.contains(x)) {
                // Add only once
                if (!duplicates.contains(x)) {
                    result.add(x);
                    duplicates.add(x);
                }
            } else {
                seen.add(x);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<Integer> sample1 = new ArrayList<>(Arrays.asList(3, 7, 5, 6, 7, 4, 8, 5, 7, 66));
        List<Integer> sample2 = new ArrayList<>(Arrays.asList(3, 5, 6, 4, 4, 5, 66, 6, 7, 6));
        List<Integer> sample3 = new ArrayList<>(Arrays.asList(3, 0, 5, 1, 0));
        List<Integer> sample4 = new ArrayList<>(Arrays.asList(3));

        // Test nested loop version
        System.out.println("Sample 1 (nested): " + findDuplicatesNestedLoops(sample1));
        System.out.println("Sample 2 (nested): " + findDuplicatesNestedLoops(sample2));
        System.out.println("Sample 3 (nested): " + findDuplicatesNestedLoops(sample3));
        System.out.println("Sample 4 (nested): " + findDuplicatesNestedLoops(sample4));

        // Test HashSet version
        System.out.println("Sample 1 (hashing): " + findDuplicatesHashing(sample1));
        System.out.println("Sample 2 (hashing): " + findDuplicatesHashing(sample2));
        System.out.println("Sample 3 (hashing): " + findDuplicatesHashing(sample3));
        System.out.println("Sample 4 (hashing): " + findDuplicatesHashing(sample4));
    }
}
