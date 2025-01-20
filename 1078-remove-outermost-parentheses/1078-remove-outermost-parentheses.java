class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sb = new StringBuilder();
        int counter = 0;
        for(char c : s.toCharArray()) {
            if(c == '(' && counter++ > 0) {
                sb.append(c);
            }
            if(c == ')' && counter-- > 1) {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}