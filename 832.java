class Solution {
  public int[][] flipAndInvertImage(int[][] img) {

    flip(img);

    for (int i = 0; i < img.length; i++) {
      for (int j = 0; j < img[i].length; j++) {
        if (img[i][j] == 0) {
          img[i][j] = 1;
        } else if (img[i][j] == 1) {
          img[i][j] = 0;
        }
      }
    }

    return img;
  }

  void flip(int[][] img) {
    for (int i = 0; i < img.length; i++) {
      int s = 0, e = img.length - 1;

      while (s < e) {
        int t = img[i][s];
        img[i][s] = img[i][e];
        img[i][e] = t;

        s++;
        e--;
      }
    }
  }
}
