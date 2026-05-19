// ________________________________________________________
// Leaders in an Array
// ________________________________________________________

import java.util.*;

class Solution {
    public ArrayList<Integer> leaders(int[] nums) {
        int len = nums.length;
        int currMax = nums[len - 1];

        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(currMax);

        for (int i = len - 2; i >= 0; i--) {
            if (nums[i] > currMax) {
                l1.add(nums[i]);
                currMax = nums[i];
            }
        }

        Collections.reverse(l1); // make order left-to-right
        return l1;
    }
}

