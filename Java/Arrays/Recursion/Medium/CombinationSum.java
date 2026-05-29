class Solution {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        List<List<Integer>> ans = new ArrayList<>();
        dfs(0, candidates, target, new ArrayList<>(), ans);
        return ans;
    }

    void dfs(int i, int[] arr, int target,
             List<Integer> path,
             List<List<Integer>> ans) {

        if (target == 0) {
            ans.add(new ArrayList<>(path));
            return;
        }

        if (i == arr.length || target < 0)
            return;

        path.add(arr[i]);
        dfs(i, arr, target - arr[i], path, ans);
        path.remove(path.size() - 1);

        dfs(i + 1, arr, target, path, ans);
    }
}