class Solution {

    int count = 0;

    public int countSubsequenceWithTargetSum(int[] nums, int k) {
        dfs(0, nums, k);
        return count;
    }

    void dfs(int i, int[] nums, int target) {

        if (target == 0) {
            count++;
            return;
        }

        if (i == nums.length || target < 0)
            return;

        dfs(i + 1, nums, target - nums[i]); // take
        dfs(i + 1, nums, target);           // skip
    }
}