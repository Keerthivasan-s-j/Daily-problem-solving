import java.util.*;
class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        List<Integer> res = new ArrayList<>();
        int n = nums.length;
        int left = 0;
        int right = n-1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target){
                res.add(mid);
                left = mid - 1;
                right = mid + 1;
                break;
            }
            else if (nums[mid] < target)
                left = mid + 1;
            else 
                right = mid - 1;
        }

        while (left >= 0 && left < n) {
            if (nums[left] != target)
                break;
            res.add(left--);
        }
        while (right < n && right >= 0) {
            if (nums[right] != target)
                break;
            res.add(right++);
        }
        Collections.sort(res);
        return res;
    }
}