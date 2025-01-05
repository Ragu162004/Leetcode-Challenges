class Solution {
    public String shiftingLetters(String str, int[][] shifts) {
        int n = str.length();
        int[] position = new int[n + 1];

        for (int[] shift : shifts) {
            int start = shift[0];
            int end = shift[1];
            int direction = shift[2];

            position[start] += (direction == 1 ? 1 : -1);
            position[end + 1] += (direction == 1 ? -1 : 1);
        }

        int netShift = 0;
        for (int i = 0; i < n; i++) {
            netShift += position[i];
            position[i] = netShift;
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            char currentChar = str.charAt(i);
            int shift = position[i] % 26;
            int newChar = ((currentChar - 'a' + shift + 26) % 26) + 'a';
            result.append((char) newChar);
        }

        return result.toString();
    }
}
