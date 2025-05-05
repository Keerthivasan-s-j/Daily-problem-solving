class Solution {
    public int wateringPlants(int[] plants, int capacity) {
        int n = plants.length;
        int steps = 0;
        int can = capacity;
        for (int i = 0; i<n; i++){
            if (plants[i] > can){
                steps += i*2 + 1;
                can = capacity;
                can -= plants[i];
                continue;
            }
            can -= plants[i];
            steps++;
        }
        return steps;
    }
}