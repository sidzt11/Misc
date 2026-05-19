// ________________________________________________________
// Print the matrix in spiral manner
// ________________________________________________________

import java.util.*;

class Solution {
    public List<Integer> spiralOrder(int[][] a) {
        List<Integer> out = new ArrayList<>();
        if (a == null || a.length == 0) return out;
        int top = 0, left = 0, bottom = a.length - 1, right = a[0].length - 1;

        while (top <= bottom && left <= right) {
            for (int j = left; j <= right; j++) out.add(a[top][j]); top++;
            for (int i = top; i <= bottom; i++) out.add(a[i][right]); right--;
            if (top <= bottom) { for (int j = right; j >= left; j--) out.add(a[bottom][j]); bottom--; }
            if (left <= right) { for (int i = bottom; i >= top; i--) out.add(a[i][left]); left++; }
        }
        return out;
    }
}

