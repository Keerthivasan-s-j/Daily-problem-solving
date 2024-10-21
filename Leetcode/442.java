import java.util.*;
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> res = new ArrayList<Integer>();
        int n = nums.length;
        int[] map = new int[n+1];
        for (int i : nums)
            map[i]++;
        for(int i=0; i<n+1; i++){
            if (map[i] >= 2)
                res.add(i);
        }
        return res;
    }
}