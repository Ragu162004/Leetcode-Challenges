import java.util.HashMap;
import java.util.Map;

class Solution {
    public long countBadPairs(int[] nums) {
        long count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        long totalPairs = (long) nums.length * (nums.length - 1) / 2;

        for (int i = 0; i < nums.length; i++) {
            int key = nums[i] - i;
            if (map.containsKey(key)) {
                count += map.get(key);  // Count how many good pairs we can form
            }
            map.put(key, map.getOrDefault(key, 0) + 1);
        }

        return totalPairs - count;  // Bad pairs = Total pairs - Good pairs
    }
}
