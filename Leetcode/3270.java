class Solution {
    public int generateKey(int num1, int num2, int num3) {
        int num = 1000;
        int d1, d2, d3;
        int k = 0;
        while (num > 0) {
            d1 = num1 / num;
            d2 = num2 / num;
            d3 = num3 / num;
            num1 = num1 % num;
            num2 = num2 % num;
            num3 = num3 % num;
            k += Math.min(d1, Math.min(d2, d3)) * num;
            num /= 10;
        }
        return k;
    }
}