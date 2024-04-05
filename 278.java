public class Solution extends VersionControl {
  public int firstBadVersion(int n) {
    long left = 1, right = n;
    while (left < right) {
      long mid = (left + right) / 2;

      if (isBadVersion((int) mid)) {
        right = mid;
      } else {
        left = mid + 1;
      }
    }

    return (int) right;
  }
}
