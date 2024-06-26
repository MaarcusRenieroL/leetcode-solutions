class Solution {
  static int romanToInteger(String s) {
    int result = 0;

    for (int i = 0; i < s.length(); i++) {
      if (i > 0 && romanToInt(s.charAt(i)) > romanToInt(s.charAt(i - 1))) {
        result += romanToInt(s.charAt(i)) - 2 * romanToInt(s.charAt(i - 1));
      } else {
        result += romanToInt(s.charAt(i));
      }
    }

    return result;

  }

  static int romanToInt(char c) {
    switch (c) {
      case 'I':
        return 1;
      case 'V':
        return 5;
      case 'X':
        return 10;
      case 'L':
        return 50;
      case 'C':
        return 100;
      case 'D':
        return 500;
      case 'M':
        return 1000;
      default:
        return 0;
    }
  }

}
