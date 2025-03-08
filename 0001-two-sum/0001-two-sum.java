class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> pair = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if(pair.containsKey(target - nums[i])) {
                return new int[]{i, pair.get(target - nums[i])};
            }
            pair.put(nums[i], i);
        }

        return new int[] {};        
    }
}