class Solution {

    private HashMap<Integer, Boolean> map; 

    private boolean helper(int i, int[][] nodes) {
        if(map.containsKey(i)) return map.get(i);
        map.put(i,false);
        for(int node : nodes[i]) {
            if(!helper(node,nodes))
                return false;
        }
        map.put(i, true);
        return true;
    }

    public List<Integer> eventualSafeNodes(int[][] graph) {
        int n = graph.length;
        map = new HashMap<>();
        List<Integer> res = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            if(helper(i, graph) == true) {
                res.add(i);
            }
        }

        return res;
    }
}