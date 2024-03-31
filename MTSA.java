import java.util.Arrays;

public class MTSA {
  public static void main(String[] args) {
    int[] nums1 = { 1, 2 };
    int[] nums2 = { 4, 3 };

    System.out.println(findMedianSortedArrays(nums1, nums2));
  }

  static double findMedianSortedArrays(int[] nums1, int[] nums2) {
    int[] mergedList = new int[nums1.length + nums2.length];

    for (int i = 0; i < nums1.length; i++) {
      mergedList[i] = nums1[i];
    }

    for (int i = nums1.length; i < mergedList.length; i++) {
      mergedList[i] = nums2[i - nums1.length];
    }

    new MTSA().mergeSort(mergedList, 0, mergedList.length - 1);

    System.out.println(Arrays.toString(mergedList));

    if (mergedList.length % 2 == 0) {
      return (double) (mergedList[mergedList.length / 2] + mergedList[(mergedList.length / 2) - 1]) / 2;
    } else {
      return (double) mergedList[mergedList.length / 2];
    }

  }

  void merge(int arr[], int p, int q, int r) {

    int n1 = q - p + 1;
    int n2 = r - q;

    int L[] = new int[n1];
    int M[] = new int[n2];

    for (int i = 0; i < n1; i++)
      L[i] = arr[p + i];
    for (int j = 0; j < n2; j++)
      M[j] = arr[q + 1 + j];

    int i, j, k;
    i = 0;
    j = 0;
    k = p;

    while (i < n1 && j < n2) {
      if (L[i] <= M[j]) {
        arr[k] = L[i];
        i++;
      } else {
        arr[k] = M[j];
        j++;
      }
      k++;
    }

    while (i < n1) {
      arr[k] = L[i];
      i++;
      k++;
    }

    while (j < n2) {
      arr[k] = M[j];
      j++;
      k++;
    }
  }

  void mergeSort(int arr[], int l, int r) {
    if (l < r) {

      int m = (l + r) / 2;

      mergeSort(arr, l, m);
      mergeSort(arr, m + 1, r);

      merge(arr, l, m, r);
    }
  }
}
