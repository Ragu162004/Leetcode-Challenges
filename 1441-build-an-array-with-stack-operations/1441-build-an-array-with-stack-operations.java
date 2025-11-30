class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> result = new ArrayList<>();
        int val = 1;

        for(int i = 0; i < target.length; i++) {
            while(val < target[i]) {
                result.add("Push");
                result.add("Pop");
                val++;
            }

            result.add("Push");
            val++;
        }
        return result;
    }
}