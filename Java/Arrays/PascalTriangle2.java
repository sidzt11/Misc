// ________________________________________________________
// Pascals Triangle 2
// ________________________________________________________

class Solution {
  public int[] pascalTriangleII(int r) {
    int[] ans = new int[r];
    int curr = 1;
    int prev = 1;
    ans[0] = 1;
    for (int i = 1; i < r; i++) {
      prev = ans[i - 1];
      curr = prev * (r - i) / i;
      ans[i] = curr;
    }
    return ans;
  }
}
