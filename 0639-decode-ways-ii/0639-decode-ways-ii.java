class Solution {
  private static final int MOD = 1000000007;

  public int numDecodings(String s) {
    if (s == null || s.length() == 0 || s.charAt(0) == '0') {
      return 0;
    }
    if (s.length() == 1) {
      return s.charAt(0) == '*' ? 9 : 1;
    }
    long prevPrev = 1, prev = s.charAt(0) == '*' ? 9 : 1;
    for (int i = 1; i < s.length(); i++) {
      char currChar = s.charAt(i), prevChar = s.charAt(i - 1);
      long curr;
      if (currChar == '*') {
        if (prevChar == '*') {
          curr = 15 * prevPrev + 9 * prev;
        } else if (prevChar == '1') {
          curr = 9 * prevPrev + 9 * prev;
        } else if (prevChar == '2') {
          curr = 6 * prevPrev + 9 * prev;
        } else {
          curr = 9 * prev;
        }
      } else if (prevChar == '*') {
        if (currChar == '0') {
          curr = 2 * prevPrev;
        } else if (currChar <= '6') {
          curr = 2 * prevPrev + prev;
        } else {
          curr = prevPrev + prev;
        }
      } else if (currChar == '0') {
        if (prevChar == '1' || prevChar == '2') {
          curr = prevPrev;
        } else {
          return 0;
        }
      } else {
        if (prevChar == '0' || (10 * (prevChar - '0') + currChar - '0' > 26)) {
          curr = prev;
        } else {
          curr = prevPrev + prev;
        }
      }
      prevPrev = prev;
      prev = curr % MOD;
    }
    return (int)prev;
  }
}