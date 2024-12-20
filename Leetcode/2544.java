class Solution {
    public int alternateDigitSum(int n) {
        String num = Integer.toString(n);
        int res = 0;
        for (int i = 0; i < num.length(); i++){
            int digit = num.charAt(i) - '0';
            if (i % 2 == 0){
                res += digit;
            }
            else{
                res -= digit;
            }
        }
        return res;
    }
}