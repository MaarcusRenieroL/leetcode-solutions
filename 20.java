class Solution {
  static boolean isValid(String s) {
    Stack<Character> s = new Stack<>();

    if (s.length() % 2 != 0) {
      return false;
    }

    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);

      if (c == '(' || c == '[' || c == '{') {
        s.push(c);
      } else {
        if (s.isEmpty()) {
          return false;
        } else if (s.peek() == '(' && c == ')') {
          s.pop();
        } else if (s.peek() == '[' && c == ']') {
          s.pop();
        } else if (s.peek() == '{' && c == '}') {
          s.pop();
        } else {
          return false;
        }
      }
    }

    return s.isEmpty();
  }
}
