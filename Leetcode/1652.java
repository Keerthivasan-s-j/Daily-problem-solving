class Solution {
    public int[] decrypt(int[] code, int k) {
        int n = code.length;
        int[] defusion_code = new int[n];
        for (int i = 0; i<n; i++){
            int sum = 0;
            if (k > 0) {
                for (int j = 1; j<=k; j++){
                    int index = (i + j) % n;
                    sum += code[index];
                }
                defusion_code[i] = sum;
            }
            else if (k < 0) {
                for (int j = 1; j<=-k; j++){
                    int index = (i - j + n) % n;
                    sum += code[index];
                }
                defusion_code[i] = sum;
            }
            else {
                return defusion_code;
            }
        }
        return defusion_code;
    }
}