import java.util.HashSet;
import java.util.ArrayList;
import java.util.List;
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> lis = new ArrayList<>();
        for (int i = 0; i < n; i++){
            set.add(nums[i]);
        }
        for (int i = 1; i <= n; i++){
            if (set.add(i)){
                lis.add(i);
            }
        }
        return lis;
    }
}