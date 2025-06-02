import java.util.*;
class Solution {
    public int distributeCandies(int[] candyType) {
        int n = candyType.length;
        Set<Integer> set = new HashSet<>();
        int res = 0;
        int max = n / 2;
        for (int candy : candyType) {
            if (set.add(candy)) {
                res++;
                if (res == max)
                    return max;
            }
        }
        return res;
    }
}