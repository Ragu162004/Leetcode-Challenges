class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        for(int i = 0 ;i < n; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) ->
            map.get(b) - map.get(a)
        );

        pq.addAll(map.keySet());
        int[] res = new int[k];
        // int i = -1;
        for(int i = 0 ;i < k; i++) {
            res[i] = pq.poll();
        }
        return res;
    }
}