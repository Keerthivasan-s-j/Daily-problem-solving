class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int[] res = new int[2];
        int ind = -1;
        while (left <= right){
            int mid = (left + right) / 2;
            if (nums[mid] == target){
                ind = mid;
                break;
            }
            if (nums[mid] < target){
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }
        if (ind == -1){
            res[0] = -1;
            res[1] = -1;
            return res;
        }

        int t = ind - 1;
        while(t >= 0){
            if (nums[t] != target){
                break;
            }
            t--;
        }
        res[0] = t + 1;

        t = ind + 1;
        while(t < nums.length){
            if (nums[t] != target){
                break;
            }
            t++;
        }
        res[1] = t - 1;
        
        return res;
    }
}