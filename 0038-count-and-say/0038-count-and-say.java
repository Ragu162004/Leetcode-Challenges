class Solution {

    private String helper(int start, int end, String s) {
        if(start == end + 1) return s;
        StringBuilder str = new StringBuilder();
        int count = 1;
        for(int i = 1; i < s.length(); i++) {
            if(s.charAt(i) != s.charAt(i - 1)) {
                str.append("" + count);
                str.append(s.charAt(i - 1));
                count = 1;
            }else {
                count++;
            }
        }
        str.append("" + count);
        str.append(s.charAt(s.length() - 1));
        s = helper(start + 1, end, str.toString());
        return s;
    }
    public String countAndSay(int n) {
        if(n == 1) return "1";
        int start = 2;
        int end = n;
        String s = "1";
        return helper(start, end, s);
    }
}