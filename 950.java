class Solution {
  public int[] deckRevealedIncreasing(int[] d) {
    LinkedList<Integer> q = new LinkedList<>();
    Arrays.sort(d);

    int[] r = new int[d.length];

    for (int i = 0; i < d.length; i++) {
      q.offer(i);
    }

    for (int i = 0; i < d.length; i++) {
      r[q.poll()] = d[i];
      q.offer(q.poll());
    }

    return r;
  }
}
