class Solution {
    public String addStrings(String num1, String num2) {
        if (num1.length() < num2.length()) {
            String temp = num1;
            num1 = num2;
            num2 = temp;
        }
        int n1 = num1.length();
        int n2 = num2.length();
        int carry = 0;
        StringBuilder res = new StringBuilder();
        int diff = n1 - n2;
        for (int i = n2-1; i>=0; i--) {
            int sum = (num1.charAt(i + diff) - '0') + (num2.charAt(i) - '0') + carry;
            res.append(sum % 10);
            carry = sum / 10;
        }
        for (int i = diff - 1; i>=0; i--) {
            int sum = (num1.charAt(i) - '0')  + carry;
            res.append(sum % 10);
            carry = sum / 10;
        }
        if (carry > 0)
            res.append(carry);
        return res.reverse().toString();
    }
}