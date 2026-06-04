class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        dfs(1, k, n, new ArrayList<>(), ans);
        return ans;
    }

    private void dfs(int start, int k, int target,
                     List<Integer> cur,
                     List<List<Integer>> ans) {

        if (k == 0 && target == 0) {
            ans.add(new ArrayList<>(cur));
            return;
        }

        if (k == 0 || target <= 0) return;

        for (int num = start; num <= 9; num++) {
            cur.add(num);
            dfs(num + 1, k - 1, target - num, cur, ans);
            cur.remove(cur.size() - 1);
        }
    }
}