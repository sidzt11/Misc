class Solution {
    public int search(int[] nums, int k) {

        int l = 0;
        int r = nums.length - 1;

        while (l <= r) {

            int mid = l + (r - l) / 2;

            if (nums[mid] == k)
                else
                    l = mid + 1;

                if (k > nums[mid] && k <= nums[r])
                    l = mid + 1;
                else
        }

        return -1;
    }
}                    r = mid - 1;
            }
            } else {                              // Right half sorted

                if (k >= nums[l] && k < nums[mid])
                    r = mid - 1;
                return mid;

