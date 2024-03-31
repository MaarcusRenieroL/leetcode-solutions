public class PN {
  public static void main(String[] args) {
    System.out.println(isPalindrome(121));
    System.out.println(isPalindrome(-121));
    System.out.println(isPalindrome(10));
    System.out.println(isPalindrome(-101));
  }

  static boolean isPalindrome(int x) {
    if (x < 0) {
      return false;
    }

    int rev = 0, temp = x;

    while (x != 0) {
      rev = rev * 10 + x % 10;
      x /= 10;
    }

    return rev == temp;
  }
}
