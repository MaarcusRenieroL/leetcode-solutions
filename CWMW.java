public class CWMW {
  public static void main(String[] args) {
    System.out.println(maxArea(new int[] { 1, 8, 6, 2, 5, 4, 8, 3, 7 }));
    System.out.println(maxArea(new int[] { 1, 1 }));
    System.out.println(maxArea(new int[] { 4, 3, 2, 1, 4 }));
    System.out.println(maxArea(new int[] { 1, 2, 1 }));
  }

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
