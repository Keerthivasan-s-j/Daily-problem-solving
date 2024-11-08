class Solution {
    public String convertToBase7(int num) {
        String res = "";
        boolean negative = num < 0;
        num = Math.abs(num);
        while (num >= 7){
            res = num % 7 + res;
            num /= 7;
        }
        res = num + res;

        return negative ? "-" + res : res;
    }
}