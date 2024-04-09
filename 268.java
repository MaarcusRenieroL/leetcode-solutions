class Solution {
  public int missingNumber(int[] nums) {
    int s = 0, ns = 0;

    for (int n : nums) {
      ns += n;
    }

    for (int i = 0; i < nums.length + 1; i++) {
      s += i;
    }

    return s - ns;
  }
}
