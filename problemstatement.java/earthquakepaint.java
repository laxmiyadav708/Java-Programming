import java.util.*;


class alphanumeric {
    public String name;
    public int count;

    alphanumeric(String name, int count) {
        this.name = name;
        this.count = count;
    }
};

class Solution {
    alphanumeric[] sortedStrings(int N, String A[]) {
        
        
        TreeMap<String, Integer> map = new TreeMap<>();
        
        for (String s : A) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        
        
        alphanumeric[] result = new alphanumeric[map.size()];
        int i = 0;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            result[i++] = new alphanumeric(entry.getKey(), entry.getValue());
        }
        
        return result;
        
    }

    public static void main(String[] args) {
        String[] arr = {"apple", "banana", "apple", "orange", "banana", "apple"};
        Solution sol = new Solution();
        alphanumeric[] result = sol.sortedStrings(arr.length, arr);
        for (alphanumeric a : result) {
            System.out.println(a.name + " " + a.count);
        }
    }
}