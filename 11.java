class Solution {

  static int maxArea(int[] height) {
    int maxArea = 0, l = 0, r = height.length - 1;

    while (l < r) {
      maxArea = max(maxArea, Math.min(height[l], height[r]) * (r - l));

      if (height[l] < height[r]) {
        l++;
      } else {
        r--;
      }
    }

    return maxArea;
  }

  static int max(int a, int b) {
    return a > b ? a : b;
  }
}
