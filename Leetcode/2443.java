class Solution {
    public boolean sumOfNumberAndReverse(int num) {
        if (num == 0)
            return true;
        for (int n = 0; n<num; n++){
            int t = n;
            int rev = 0;
            while (t > 0){
                rev = rev * 10 + t % 10;
                t /= 10;
            }
            if (n + rev == num){
                return true;
            }
        }
        return false;
    }
}