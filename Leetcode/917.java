class Solution {
    public String reverseOnlyLetters(String s) {
        int left = 0;
        int right = s.length()-1;
        char[] str = s.toCharArray();
        while (left < right){
            if (str[left] < 65 || str[left] > 90 && str[left] < 97 || str[left] > 122){
                left++;
                continue;
            }
            if (str[right] < 65 || str[right] > 90 && str[right] < 97 || str[right] > 122){
                right--;
                continue;
            }
            char temp = str[left];
            str[left++] = str[right];
            str[right--] = temp;
        }
        return new String(str);
    }
}