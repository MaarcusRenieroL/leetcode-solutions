class Solution {
  public int findNumbers(int[] nums) {
    int r = 0;

    for (int n : nums) {
      if (count(n) % 2 == 0) {
        r++;
      }
    }

    return r;
  }

  int count(int n) {
    int r = 0;

    while (n != 0) {
      r++;
      n /= 10;
    }

    return r;
  }
}
