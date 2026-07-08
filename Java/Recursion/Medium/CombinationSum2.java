class Solution {

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {

        Arrays.sort(candidates);

        List<List<Integer>> ans = new ArrayList<>();

        dfs(0, candidates, target, new ArrayList<>(), ans);

        return ans;
    }

    void dfs(int idx, int[] arr, int target,
             List<Integer> path,
             List<List<Integer>> ans) {

        if (target == 0) {
            ans.add(new ArrayList<>(path));
            return;
        }

        for (int i = idx; i < arr.length; i++) {

            if (i > idx && arr[i] == arr[i - 1])
                continue;

            if (arr[i] > target)
                break;

            path.add(arr[i]);

            dfs(i + 1, arr, target - arr[i], path, ans);

            path.remove(path.size() - 1);
        }
    }
}