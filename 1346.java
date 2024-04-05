class Solution {
  public boolean checkIfExist(int[] a) {
    boolean f = false;

    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a.length; j++) {
        if ((a[i] == 2 * a[j]) && (i != j)) {
          f = true;
        }
      }
    }

    return f;
  }
}
