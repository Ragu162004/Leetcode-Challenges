class Solution {
    public boolean hasMatch(String s, String p) {
        int star_idx = p.indexOf("*");
        int pre_pattern_idx = s.indexOf(p.substring(0, star_idx));
        int post_pattern_idx = s.indexOf(p.substring(star_idx + 1), pre_pattern_idx + star_idx);

        if(pre_pattern_idx != -1 && post_pattern_idx != -1) return true;
        return false;
    }
}