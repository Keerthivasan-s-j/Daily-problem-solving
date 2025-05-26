import java.util.*;
class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        
        int n = s.length();
        int res = 0;
        int i = 0;
        while (i<n-1) {
            char ch = s.charAt(i);
            char next = s.charAt(i+1);
            if (map.get(ch) < map.get(next)) {
                res += map.get(next) - map.get(ch);
                i += 2;
                continue;
            }
            res += map.get(ch);
            i++;
        }
        if (i < n)
        res += map.get(s.charAt(i));
        return res;
    }
}