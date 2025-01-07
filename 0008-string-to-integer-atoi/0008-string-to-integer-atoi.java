class Solution {
    public int myAtoi(String s) {
        String str = s.trim();
        if (str.isEmpty()) return 0;
        int sign = 1, i = 0, result = 0;
        int len = str.length();
        if (str.charAt(i) == '-' || str.charAt(i) == '+') {
            sign = (str.charAt(i) == '-') ? -1 : 1;
            i++;
        }
        while (i < len && str.charAt(i) >= '0' && str.charAt(i) <= '9') {
            int digit = str.charAt(i) - '0';
            if (result > (Integer.MAX_VALUE - digit)/10) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            result = result * 10 + digit;
            i++;
        }

        return result * sign;
    }
}
