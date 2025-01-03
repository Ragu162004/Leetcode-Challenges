class Solution {
    public String convertToBase7(int num) {
        if(num == 0) return "0";
        if(num > -7 && num < 7) return String.valueOf(num);
        StringBuilder sb = new StringBuilder();
        int flag = 0;
        if(num < 0) {
            num = -1 * num;
            flag = 1;
        }
        while(num != 0) {
            sb.append(String.valueOf(num%7)); 
            num = num / 7;
        }
        String s = flag == 1 ? sb.append('-').reverse().toString() : sb.reverse().toString();
        return s;
    }
}