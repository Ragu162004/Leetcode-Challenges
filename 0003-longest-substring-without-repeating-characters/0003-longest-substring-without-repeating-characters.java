class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0) return 0;
        int max = Integer.MIN_VALUE;
        int i = 0,j = 0;
        Set<Character> table = new HashSet<>();
        while(j < s.length()) {
            while(table.contains(s.charAt(j))) {
                table.remove(s.charAt(i));
                i++;
            }
            table.add(s.charAt(j));
            j++;
            max = Math.max(max,j - i);
        }
        return max;
    }
}