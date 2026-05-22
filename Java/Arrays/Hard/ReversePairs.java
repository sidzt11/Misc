class Solution {

    public int reversePairs(int[] nums) {
        return (int) mergeSort(nums, 0, nums.length - 1);
    }

    long mergeSort(int[] a, int l, int r) {
        if (l >= r) return 0;

        int m = (l + r) / 2;

        long count = 0;

        count += mergeSort(a, l, m);
        count += mergeSort(a, m + 1, r);
        count += countPairs(a, l, m, r);

        merge(a, l, m, r);

        return count;
    }

    long countPairs(int[] a, int l, int m, int r) {
        long count = 0;

        int j = m + 1;

        for (int i = l; i <= m; i++) {

            while (j <= r && (long)a[i] > 2L * a[j]) {
                j++;
            }

            count += (j - (m + 1));
        }

        return count;
    }

    void merge(int[] a, int l, int m, int r) {

        int[] temp = new int[r - l + 1];

        int i = l, j = m + 1, k = 0;

        while (i <= m && j <= r) {

            if (a[i] <= a[j]) {
                temp[k++] = a[i++];
            } else {
                temp[k++] = a[j++];
            }
        }

        while (i <= m) temp[k++] = a[i++];
        while (j <= r) temp[k++] = a[j++];

        for (i = l, k = 0; i <= r; i++, k++) {
            a[i] = temp[k];
        }
    }
}