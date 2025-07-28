class Solution {
    public int countHillValley(int[] nums) {
        List<Integer> ls = new ArrayList<>();
        ls.add(nums[0]);
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] != nums[i - 1]) {
                ls.add(nums[i]);
            }
        }
        System.out.print(ls);
        int hill_valley_count = 0;
        for(int i = 1; i < ls.size() - 1; i++) {
            int j = i - 1;
            int k = i + 1;
            if(ls.get(j) < ls.get(i) && ls.get(k) < ls.get(i)) {
                hill_valley_count++;
            }else if(ls.get(j) > ls.get(i) && ls.get(k) > ls.get(i)) {
                hill_valley_count++;
            }
        }

        return hill_valley_count;
    }
}