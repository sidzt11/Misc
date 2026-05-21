class Solution {
    public long numberOfInversions(int[] nums) {
        return mergeSort(nums, 0, nums.length - 1);
    }

    long mergeSort(int[] a, int l, int r) {
        if (l >= r) return 0;

        int m = (l + r) / 2;

        long count = 0;

        count += mergeSort(a, l, m);
        count += mergeSort(a, m + 1, r);
        count += merge(a, l, m, r);

        return count;
    }

    long merge(int[] a, int l, int m, int r) {
        int[] temp = new int[r - l + 1];

        int i = l, j = m + 1, k = 0;
        long count = 0;

        while (i <= m && j <= r) {
            if (a[i] <= a[j]) {
                temp[k++] = a[i++];
            } else {
                count += (m - i + 1);
                temp[k++] = a[j++];
            }
        }

        while (i <= m) temp[k++] = a[i++];
        while (j <= r) temp[k++] = a[j++];

        for (i = l, k = 0; i <= r; i++, k++) {
            a[i] = temp[k];
        }

        return count;
    }
}