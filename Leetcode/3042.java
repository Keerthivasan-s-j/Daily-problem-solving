class Solution {
    public int countPrefixSuffixPairs(String[] words) {
        int n = words.length;
        int count = 0;
        for (int i = 0; i<n; i++) {
            String str1 = words[i];
            int l1 = str1.length();
            for (int j = i + 1; j<n; j++) {
                String str2 = words[j];
                int l2 = str2.length();
                if (l1 <= l2 && str2.substring(0,l1).equals(str1) && str2.substring(l2-l1).equals(str1)) {
                    count++;
                }
            }
        }
        return count;
    }
}