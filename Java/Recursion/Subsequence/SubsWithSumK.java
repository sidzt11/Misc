class Solution {

    public boolean checkSubsequenceSum(int[] nums, int k) {
        return solve(0, nums, k);
    }

    boolean solve(int i, int[] nums, int target) {

        // Found required sum
        if(target == 0)
            return true;

        // Reached end
        if(i == nums.length)
            return false;

        // Pick current element
        boolean take = false;

        if(nums[i] <= target)
            take = solve(i + 1, nums, target - nums[i]);

        // Not pick
        boolean notTake = solve(i + 1, nums, target);

        return take || notTake;
    }
}