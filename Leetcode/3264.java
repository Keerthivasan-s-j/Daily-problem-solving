class Solution {
    static int findMinIndex(int[] arr){
        int min = arr[0];
        int ind = 0;
        for (int i = 1; i<arr.length; i++){
            if (arr[i] < min){
                min = arr[i];
                ind = i;
            }
        }
        return ind;
    }
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        for (int i = 0; i<k; i++){
            int minInd = findMinIndex(nums);
            nums[minInd] *= multiplier;
        }
        return nums;
    }
}