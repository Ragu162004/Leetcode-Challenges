class Solution {

    private String buildSequence(String s) {
        StringBuilder t1 = new StringBuilder();
        int i = s.length() - 1;

        int hashCount = 0;
        while( i >= 0) {
            if(s.charAt(i) == '#') {
                hashCount++;
            } else if(hashCount != 0 ) {
                hashCount--;
            } else if(hashCount == 0)
                t1.append(s.charAt(i));
            i--;
        }
        return t1.reverse().toString();
    } 

    public boolean backspaceCompare(String s, String t) {
        s = buildSequence(s);
        t = buildSequence(t);

        System.out.print(s + " " + t);
        return s.equals(t);
        
    }
}