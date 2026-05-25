class Solution {
    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> powerSet(int[] nums) {
        backtrack(0, nums, new ArrayList<>());
        return ans;
    }

    void backtrack(int i, int[] nums, List<Integer> cur) {
        if (i == nums.length) {
            ans.add(new ArrayList<>(cur));
            return;
        }

        backtrack(i + 1, nums, cur);

        cur.add(nums[i]);
        backtrack(i + 1, nums, cur);
        cur.remove(cur.size() - 1);
    }
}