class Solution {
    public int lowerBound(int[] nums, int x) {

        int l = 0;
        int r = nums.length - 1;
        int ans = nums.length;

        while (l <= r) {

            int mid = l + (r - l) / 2;

            if (nums[mid] >= x) {
                ans = mid;
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }

        return ans;
    }
}
