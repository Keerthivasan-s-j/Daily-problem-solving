import java.util.*;
class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        List<Integer> res = new ArrayList<>();
        List<Integer> lis = new ArrayList<>();
        int n = nums.length;
        for (int i = 0; i<n; i++) {
            if (nums[i] == key)
                lis.add(i);
        }
        for (int i = 0; i<n; i++) {
            for (int j : lis) {
                if (Math.abs(i-j) <= k) {
                    res.add(i);
                    break;
                }
            }
        }
        return res;
    }
}