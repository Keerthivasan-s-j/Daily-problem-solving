import java.util.*;
class Solution {
    public int maxIceCream(int[] costs, int coins) {
       Arrays.sort(costs);
       int no_ice_cream = 0;
       for (int i : costs){
            if(coins - i >= 0){
                coins -= i;
                no_ice_cream++;
            }
       }
       return no_ice_cream;
    }
}