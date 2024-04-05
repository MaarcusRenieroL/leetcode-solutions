class Solution {
  public boolean isGoodArray(int[] nums) {
    int x = nums[0], y;

    for (int n : nums) {
      while (n > 0) {
        y = x % n;
        x = n;
        n = y;
      }
    }

    return x == 1;
  }
}
