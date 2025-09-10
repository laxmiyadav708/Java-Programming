import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
public class frequencygame {
    static class Solution {
        public static int frequencygame(int arr[] , int n) {
            HashMap<Integer , Integer> map = new HashMap<>();
            for (int i : arr)
            {
                map.put(i, map.getOrDefault(i, 0) + 1);

            }
            int min = Collections.min(map.values());
            for(Map.Entry<Integer , Integer> entry : map.entrySet())
            {
                if(entry.getValue() == min)
                {
                    return entry.getKey();
                }
            }

            return -1;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 3, 3};
        int n = arr.length;
        int result = Solution.frequencygame(arr, n);
        System.out.println(result);
    }
}