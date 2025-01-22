class Solution {
    private void backtrack(List<List<Integer>> result, List<Integer> list, int[] nums, boolean[] seen) {
        if(list.size() == nums.length) {
            result.add(new ArrayList<>(list));
            return;
        }

        for(int i = 0;i < nums.length; i++) {
            if(seen[i] || (i > 0 && nums[i] == nums[i - 1] && !seen[i - 1])) continue;
            list.add(nums[i]);
            seen[i] = true;
            backtrack(result, list, nums, seen);
            list.remove(list.size() - 1);
            seen[i] = false;
        }
    }

    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        boolean[] seen = new boolean[nums.length];
        Arrays.fill(seen, false);
        backtrack(result,new ArrayList<>(), nums, seen);
        return result;
    }
}