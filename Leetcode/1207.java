import java.util.*;
class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : arr){
            if (map.containsKey(i)){
                map.put(i, map.get(i) + 1);
                continue;
            }
            map.put(i, 1);
        }
        HashSet<Integer> set = new HashSet<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()){
            if (!set.add(entry.getValue())){
                return false;
            }
        }
        return true;
    }
}