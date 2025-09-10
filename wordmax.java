import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* Helper class containing function SortedDuplicates
containg arguments
arr[]: the duplicated array
n: size of the array
*/
class Solution {
    // print the elements which appear more than
    // once in the array in sorted order
    public static void SortedDuplicates(int arr[], int n) {
         Map<Integer, Integer> map = new HashMap<>();
            for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        List<Integer> duplicates = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                duplicates.add(entry.getKey());
            }
        }
        Collections.sort(duplicates);
        if (duplicates.isEmpty()) {
            System.out.print("-1");
        } else {
            for (int d : duplicates) {
                System.out.print(d + " ");
            }
        }
    }
}
