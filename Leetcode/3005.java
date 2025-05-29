import java.util.*;
class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int max = 0;
        for (int num : nums) {
            int freq = map.getOrDefault(num, 0) + 1;
            map.put(num, freq);
            max = Math.max(max, freq);
        }
        int count = 0;
        for (int key : map.keySet()) {
            int freq = map.get(key);
            if (freq == max)
                count += freq;
        }
        return count;
    }
}