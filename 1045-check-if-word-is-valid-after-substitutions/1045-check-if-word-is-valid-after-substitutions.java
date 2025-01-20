class Solution {
    public boolean isValid(String s) {
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < s.length(); i++) {
            sb.append(s.charAt(i));
            
            if (sb.length() >= 3 && sb.charAt(sb.length() - 1) == 'c' 
                && sb.charAt(sb.length() - 2) == 'b' 
                && sb.charAt(sb.length() - 3) == 'a') {
                
                sb.delete(sb.length() - 3, sb.length());
            }
        }
        
        return sb.length() == 0;
    }
}
