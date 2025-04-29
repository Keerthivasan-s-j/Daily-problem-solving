class Solution {
    public String restoreString(String s, int[] indices) {
        int n = s.length();
        char[] str = new char[n];
        for (int i = 0; i<n; i++){
            int index = indices[i];
            str[index] = s.charAt(i);
        }
        return new String(str);
    }
}