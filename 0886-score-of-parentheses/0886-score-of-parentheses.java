class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        for(char ch : s.toCharArray()) {
            if(ch == '(') {
                stack.push(-1);
            }else {
                if(!stack.isEmpty() && stack.peek() == -1) {
                    stack.pop();
                    stack.push(1);
                }else {
                    int curr = 0;
                    while(!stack.isEmpty() && stack.peek() != -1) {
                        curr += stack.pop();
                    }

                    stack.pop();
                    stack.push(2 * curr);
                }
            }
        }
        int score = 0;
        while(!stack.isEmpty()) {
            score += stack.pop();
        }
        return score;
    }
}