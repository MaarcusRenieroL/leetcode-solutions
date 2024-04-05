class Solution {
  public int[] searchRange(int[] nums, int target) {
    int[] res = new int[] { -1, -1 };
    int l = 0, r = nums.length - 1, index = -1;

    while (l <= r) {
      int m = l + (r - l) / 2;

      if (nums[m] == target) {
        index = m;
        break;
      } else if (nums[m] > target) {
        r = m - 1;
      } else {
        l = m + 1;
      }
    }

    if (index == -1) {
      return res;
    } else {
      l = index;
      r = index;

      while (l >= 0 && nums[l] == target) {
        l--;
      }

      while (r < nums.length && nums[r] == target) {
        r++;
      }
    }

    res[0] = l + 1;
    res[1] = r - 1;

    return res;
  }
}
