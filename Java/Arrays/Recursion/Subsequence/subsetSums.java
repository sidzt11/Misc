class Solution {

    public ArrayList<Integer> subsetSums(int[] nums) {

        ArrayList<Integer> ans = new ArrayList<>();

        dfs(0, 0, nums, ans);

        return ans;
    }

    void dfs(int i, int sum, int[] nums,
             ArrayList<Integer> ans) {

        if (i == nums.length) {
            ans.add(sum);
            return;
        }

        dfs(i + 1, sum + nums[i], nums, ans); // take
        dfs(i + 1, sum, nums, ans);           // skip
    }
}