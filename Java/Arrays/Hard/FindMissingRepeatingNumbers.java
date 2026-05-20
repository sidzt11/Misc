import java.util.*;

class Solution {
    public int[] findMissingRepeatingNumbers(int[] nums) {
        int n = nums.length;
        int xor = 0;

        for (int i = 0; i < n; i++) {
            xor ^= nums[i];
            xor ^= (i + 1);
        }

        int rightMostBit = xor & -xor;
        int x = 0, y = 0;

        for (int i = 0; i < n; i++) {
            if ((nums[i] & rightMostBit) != 0) x ^= nums[i];
            else y ^= nums[i];

            if (((i + 1) & rightMostBit) != 0) x ^= (i + 1);
            else y ^= (i + 1);
        }

        for (int num : nums) {
            if (num == x) return new int[]{x, y};
        }
        return new int[]{y, x};
    }
}