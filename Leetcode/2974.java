import java.util.*;
class Solution {
    public int[] numberGame(int[] nums) {
        int[] arr = nums;
        Arrays.sort(arr);
        for (int i = 1; i<arr.length; i += 2){
            int temp = arr[i];
            arr[i] = arr[i-1];
            arr[i-1] = temp;
        }
        return arr;
    }
}