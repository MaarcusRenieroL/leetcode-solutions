class Solution {
  static int reverseInteger(int n) {
    double result = 0;
    boolean isNegative = n < 0;
    n = n < 0 ? n * -1 : n;

    while (n != 0) {
      result = result * 10 + n % 10;
      n /= 10;
    }

    if (isNegative) {
      result *= -1;
    }

    if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
      return 0;
    }

    return (int) result;
  }

}
