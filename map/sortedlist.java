import java.util.*;
public class sortedlist {
    public static void main(String[] args) {
      
        List<Integer> intList = new ArrayList<>(Arrays.asList(2, 5, 6, 9, 8, 4, 2, 8));
        Collections.sort(intList);
        System.out.println("Sorted Integer List: " + intList);

        List<String> strList = new ArrayList<>(Arrays.asList("hello", "hii", "hye"));
        Collections.sort(strList);
        System.out.println("Sorted String List: " + strList);
    }
    

}
