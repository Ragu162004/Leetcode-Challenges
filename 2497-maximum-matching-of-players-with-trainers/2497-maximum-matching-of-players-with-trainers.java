class Solution {
    public int matchPlayersAndTrainers(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int contentChildren = 0;
        int i = 0, j = 0;
        while(i < g.length && j < s.length) {
            if(s[j] >= g[i]) {
                contentChildren++;
                i++;
                j++;
            } else {
                j++;
            }
        }

        return contentChildren;
    }
}