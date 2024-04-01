class Solution {
  public List<String> spiralOrder(int[][] matrix) {
    int l = 0, t = 0, r = matrix[0].length - 1, b = matrix.length - 1;
    List<Integer> result = new ArrayList<>();

    while ((l <= r) && (t <= b)) {

      for (int i = l; i <= r; i++) {
        result.add(matrix[t][i]);
      }

      t++;

      for (int i = t; i <= b; i++) {
        result.add(matrix[i][r]);
      }

      r--;

      if (t <= b) {
        for (int i = r; i >= l; i--) {
          result.add(matrix[b][i]);
        }

        b--;
      }

      if (l <= r) {
        for (int i = b; i >= t; i--) {
          result.add(matrix[i][l]);
        }

        l++;
      }
    }

    return result;
  }

}
