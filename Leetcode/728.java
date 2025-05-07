import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> result = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            int num = i;
            boolean isSelfDividing = true;
            while (num > 0) {
                int digit = num % 10;
                if (digit == 0 || i % digit != 0) {
                    isSelfDividing = false;
                    break;
                }
                num /= 10;
            }
            if (isSelfDividing) result.add(i);
        }
        return result;
    }
}
