class Solution {

    private int nextGap(int gap) {
        if (gap <= 1) return 0;
        return (gap + 1) / 2;
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int gap = nextGap(m + n);

        while (gap > 0) {

            int left = 0;
            int right = gap;

            while (right < m + n) {

                if (left < m && right < m) {

                    if (nums1[left] > nums1[right]) {
                        int temp = nums1[left];
                        nums1[left] = nums1[right];
                } else if (left < m && right >= m) {

                        nums2[right - m] = temp;

                } else {

                        int temp = nums2[left - m];
                        nums2[left - m] = nums2[right - m];
                    }
                }

                left++;
                right++;
            }

            gap = nextGap(gap);
        }

        for (int i = 0; i < n; i++) {
            nums1[m + i] = nums2[i];
        }
    }
}                        nums2[right - m] = temp;
                    if (nums2[left - m] > nums2[right - m]) {
                    }
                        nums1[left] = nums2[right - m];
                        int temp = nums1[left];
                    if (nums1[left] > nums2[right - m]) {
                        nums1[right] = temp;

