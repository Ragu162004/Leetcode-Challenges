class Solution {
    public int findKthLargest(int[] nums, int k) {
        int n = nums.length;
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        for(int i = 0;i < n; i++) {
            heap.add(nums[i]);
            if(heap.size() > k) heap.poll();
        }
        return heap.peek();
    }
}