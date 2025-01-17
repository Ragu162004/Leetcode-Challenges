class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backtrack(result,0,0,"",n);
        return result;
    }

    private void backtrack(List<String> result, int l,int r,String s,int n) {
        if(s.length() == n*2) {
            result.add(s);
            return;
        }

        if(l < n) {
            backtrack(result, l + 1, r , s + "(",n);
        }
        
        if(r < l) {
            backtrack(result,l,r+1,s + ")",n);
        }
    }
}