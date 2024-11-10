class Solution {
    public int countEven(int num) {
        int count = 0;
        for (int i = 2; i<=num; i++){
            int sum = 0;
            int n = i;
            while (n>0){
                sum += n % 10;
                sum = sum % 2;
                n /= 10;
            }
            if (sum == 0){
                count++;
            }
        }
        return count;
    }
}