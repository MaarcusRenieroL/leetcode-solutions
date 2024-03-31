class Solution {
  static int lengthOfLongestSubstring(String s) {
    int result = 0, left = 0;
    int[] index = new int[128];

    for (int i = 0; i < s.length(); i++) {
      left = Math.max(left, index[s.charAt(i)]);
      index[s.charAt(i)] = i + 1;
      result = Math.max(result, i - left + 1);
    }

    return result;
  }

}
