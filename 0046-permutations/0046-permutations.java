class Solution {

    void backtrack(List<List<Integer>> result,List<Integer> list, int[] nums) {
        if(list.size() == nums.length) {
            result.add(new ArrayList<>(list));
            return;
        }

        for(int num : nums) {
            if(list.contains(num)) continue;
            list.add(num);
            backtrack(result, list, nums);
            list.remove(list.size() - 1);
        }
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result,new ArrayList<>(), nums);
        return result;
    }
}