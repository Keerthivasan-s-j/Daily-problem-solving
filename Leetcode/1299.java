// Input: arr = [17,18,5,4,6,1]
// Output: [18,6,6,6,1,-1]

class Solution {
    public int[] replaceElements(int[] arr) {
        int n = arr.length;
        int[] res = new int[n];
        int i = n-1;
        int j = n-2;
        res[i] = -1;
        while (j >= 0) {
            res[j] = arr[i];
            if (arr[j] > arr[i]) {
                i = j;
            }
            j--;
        }
        return res;
    }
}