class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        if(s1.equals(s2)) return true;
        int count = 0;
        int first = -1, second = -1;
        for(int i = 0;i < s1.length(); i++) {
            if(s1.charAt(i) != s2.charAt(i)) {
                count++;
                if(count > 2) return false;
                if(first == -1) first = i;
                else second = i;
            }
        }
        if(count != 2) return false;
        return s1.charAt(first) == s2.charAt(second) && s1.charAt(second) == s2.charAt(first); 
    }
}