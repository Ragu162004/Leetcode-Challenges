class Solution {
    public int countPartitions(int[] nums) {
        int tot_sum = 0;
        for(int num : nums) {
            tot_sum += num;
        }

        int even_partition_count = 0;
        int l_sum = 0;
        for(int i = 0; i < nums.length - 1; i++) {
            l_sum += nums[i];
            if((l_sum - (tot_sum - l_sum)) % 2 == 0) even_partition_count++;
        }

        return even_partition_count;
    }
}