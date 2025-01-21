class Solution {

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        
        result.add(new ArrayList<>());
        
        for (int num : nums) {
            List<List<Integer>> newPermutations = new ArrayList<>();
            
            for (List<Integer> perm : result) {
                for (int i = 0; i <= perm.size(); i++) {
                    List<Integer> newPerm = new ArrayList<>(perm);
                    newPerm.add(i, num);
                    newPermutations.add(newPerm);
                }
            }
            
            result = newPermutations;
        }
        
        return result;
    }
}