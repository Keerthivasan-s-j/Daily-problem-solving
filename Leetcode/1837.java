class Solution {
    public int sumBase(int n, int k) {
        int res = 0;
        while (n >= k){
            res += n % k;
            n /= k;
        }
        res += n;
        return res;
    }
}