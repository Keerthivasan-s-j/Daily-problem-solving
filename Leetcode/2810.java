class Solution {
    public String finalString(String s) {
        char[] str = new char[s.length()];
        int ind = 0;
        int i = 0;
        while(i<s.length()){
            if (s.charAt(i) == 'i'){
                int left = 0;
                int right = ind-1;
                while(left < right){
                    char t = str[left];
                    str[left++] = str[right];
                    str[right--] = t;
                }
            }
            else{
                str[ind++] = s.charAt(i);
            }
            i++;
        }
        //converts only the specified portion to string
        return new String(str, 0, ind);
    }
}