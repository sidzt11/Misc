import java.util.*;

class Solution {
    public List<List<Integer>> pascalTriangleIII(int n) {
        List<List<Integer>> result = new ArrayList<>();

        if (n <= 0) return result;

        for (int i = 0; i < n; i++) {
            List<Integer> row = new ArrayList<>();

            for (int j = 0; j <= i; j++) {

                if (j == 0 || j == i) {
                    row.add(1);
                } else {
                    List<Integer> prevRow = result.get(i - 1);
                    row.add(prevRow.get(j - 1) + prevRow.get(j));
                }
            }

            result.add(row);
        }

        return result;
    }
}