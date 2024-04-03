class Solution {
  public int calPoints(String[] Operations) {
    int[] Score = new int[Operations.length];
    int size = 0;

    for (String element : Operations) {
      switch (element) {
        case "+" -> {
          Score[size] = Score[size - 1] + Score[size - 2];
          size++;
        }
        case "C" -> {
          size--;
        }
        case "D" -> {
          Score[size] = 2 * Score[size - 1];
          size++;
        }
        default -> {
          Score[size] = Integer.parseInt(element);
          size++;
        }
      }
    }
    int sum = 0;
    int j;
    for (j = 0; j < size; j++) {
      sum += Score[j];
    }
    return sum;
  }
}
