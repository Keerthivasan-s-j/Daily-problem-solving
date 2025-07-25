class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder result = new StringBuilder();
        int i = 0, j = 0;
        int l1 = word1.length();
        int l2 = word2.length();
        while (i<l1 && j<l2){
            result.append(word1.charAt(i++));
            result.append(word2.charAt(j++));
        }

        while (i<l1)
            result.append(word1.charAt(i++));

        while (j<l2)
            result.append(word2.charAt(j++));

        return result.toString();
    }
}