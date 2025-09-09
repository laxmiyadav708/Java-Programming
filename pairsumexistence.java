import java.util.Arrays;

class Geeks {
    public static int sumExistsSorted(int[] arr, int sum) {
        Arrays.sort(arr);  
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int currSum = arr[left] + arr[right];
            if (currSum == sum) {
                return 1;
            } else if (currSum > sum) {
                right--;
            } else {
                left++;
            }
        }
        return 0;
    }
}
public class pairsumexistence {
    public static void main(String[] args) {
        int[] arr = {10, 15, 3, 7};
        int sum = 17;
        int result = Geeks.sumExistsSorted(arr, sum);
        System.out.println(result);  
    }
}