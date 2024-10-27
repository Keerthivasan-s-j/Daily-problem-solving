class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> res = new ArrayList<>();
        int max = candies[0];
        for (int i : candies){
            if (i > max)
                max = i;
        }
        for (int i : candies){
            res.add(i+extraCandies >= max);
        }
        return res;
    }
}