class Solution {
    public String removeTrailingZeros(String num) {
        int n = num.length();
        int i = n-1;
        StringBuffer res = new StringBuffer();
        while (i >= 0){
            if (num.charAt(i) != '0'){
                break;
            }
            i--;
        }
        for (int j = 0; j<=i; j++){
            res.append(num.charAt(j));
        }
        return res.toString();
    }
}