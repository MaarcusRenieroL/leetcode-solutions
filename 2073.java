class Solution {
  public int timeRequiredToBuy(int[] tickets, int k) {
    int t = 0;

    for (int i = 0; i < tickets.length; i++) {
      if (i <= k) {
        t += (tickets[i] < tickets[k]) ? tickets[i] : tickets[k];
      } else {
        t += (tickets[i] < tickets[k] - 1) ? tickets[i] : tickets[k] - 1;
      }
    }

    return t;
  }
}
