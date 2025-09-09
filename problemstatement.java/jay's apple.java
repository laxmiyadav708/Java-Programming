//unique element ke liye always use hashset
//counting element ke liye use hashmap 
import java.util.HashSet;
class Solution {
    public int minimumApple(int[] arr) {
        HashSet<Integer> Person = new HashSet<>();
        for (int person : arr) {
            Person.add(person);
        }
        return Person.size();
    }
    
}

