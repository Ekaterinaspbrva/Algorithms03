public class KthLargest {
    public int kthLargest(int[] a, int k) {
        for (int bypass = 0; bypass < a.length - 1; bypass++) { //sorting
            boolean already_sorted = true;
            for (int i = 0; i < a.length - 1 - bypass; i++) {
                if (a[i] > a[i + 1]) {
                    int tempSort = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = tempSort;
                    already_sorted = false;
                }
            }
            if (already_sorted) {
                break;
            }
        };
        return a[a.length - k];
    }
}
