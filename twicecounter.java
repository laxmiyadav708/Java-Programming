import java.util.HashMap;
import java.util.Map;

public class twicecounter {
    public static void main(String[] args) {
        String[] list = {"Geeks", "For", "Geeks"};
        int n = list.length;

        int result = countWords(list, n);
        System.out.println(result);
    }

    public static int countWords(String[] list, int n) {
        Map<String, Integer> freqMap = new HashMap<>();

        for (String word : list) {
            freqMap.put(word, freqMap.getOrDefault(word, 0) + 1);
        }

        int count = 0;
        for (int freq : freqMap.values()) {
            if (freq == 2) count++;
        }

        return count;
    }
}
