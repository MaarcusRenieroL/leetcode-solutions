class Solution {
  public boolean canJump(int[] nums) {
    int l = nums.length - 1;

    for (int i = nums.length - 1; i >= 0; i--) {
      if (i + nums[i] >= l) {
        l = i;
      }
    }

    return l == 0;
  }
}
