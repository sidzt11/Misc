import java.util.*;

class Solution {
    public List<Integer> majorityElementTwo(int[] nums) {
        int c1 = 0, c2 = 0, v1 = 0, v2 = 1;

        for (int n : nums) {
            if (n == v1) c1++;
            else if (n == v2) c2++;
            else if (c1 == 0) { v1 = n; c1 = 1; }
            else if (c2 == 0) { v2 = n; c2 = 1; }
            else { c1--; c2--; }
        }

        c1 = 0; c2 = 0;
        for (int n : nums) {
            if (n == v1) c1++;
            else if (n == v2) c2++;
        }

        List<Integer> res = new ArrayList<>();
        if (c1 > nums.length / 3) res.add(v1);
        if (c2 > nums.length / 3) res.add(v2);
        return res;
    }
}