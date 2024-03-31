import java.util.Arrays;

public class LCP {
  public static void main(String[] args) {
    System.out.println(longestCommonPrefix(new String[] { "flower", "flow", "flight" }));
    System.out.println(longestCommonPrefix(new String[] { "dog", "racecar", "car" }));
  }

  static String longestCommonPrefix(String[] strs) {
    Arrays.sort(strs);

    String first = strs[0];
    String last = strs[strs.length - 1];
    int i = 0;

    while (i < first.length() && i < last.length() && first.charAt(i) == last.charAt(i)) {
      i++;
    }

    return first.substring(0, i);
  }
}
