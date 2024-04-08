class Solution {
  public boolean searchMatrix(int[][] matrix, int target) {
    int m = matrix.length, n = matrix[0].length, p1 = 0, p2 = n - 1;

    while (p1 < n && p2 >= 0) {
      if (matrix[p1][p2] == target) {
        return true;
      } else if (matrix[p1][p2] > target) {
        p2--;
      } else {
        p1++;
      }
    }

    return false;
  }
}
