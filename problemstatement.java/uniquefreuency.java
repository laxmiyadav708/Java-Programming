//map is used here tio store the frequency of each element
import java.util.HashMap;
import java.util.HashSet;
public 
class uniquefreuency {
    public static boolean isFrequencyUnique(int N, int[] arr) {
        // Step 1: Count frequency of elements
        HashMap<Integer, Integer> freqMap = new HashMap<>();
//         for (int num : arr) {
//             freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
//         }

        
//         HashSet<Integer> freqSet = new HashSet<>();
//         for (int freq : freqMap.values()) {
//             if (!freqSet.add(freq)) {
//                 return false;
//             }
//         }

//         return true;
//     }
// }
        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        HashSet<Integer> freqSet = new HashSet<>();
        for (int freq : freqMap.values()) {
            freqSet.add(freq);
        }
        return freqSet.size() == freqMap.size();

    }
}