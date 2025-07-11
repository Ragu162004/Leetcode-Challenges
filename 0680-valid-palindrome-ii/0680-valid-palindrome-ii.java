class Solution {
    private boolean checkPalindrome(String s, int i, int j, boolean canDelete) {
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                if (!canDelete) return false;
                return checkPalindrome(s, i + 1, j, false) || checkPalindrome(s, i, j - 1, false);
            }
            i++;
            j--;
        }
        return true;
    }

    public boolean validPalindrome(String s) {
        return checkPalindrome(s, 0, s.length() - 1, true);
    }
}
