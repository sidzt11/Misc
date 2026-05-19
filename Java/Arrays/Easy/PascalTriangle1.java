ww// ________________________________________________________
// Pascal Triangle 1
// ________________________________________________________

class Solution {
    public int pascalTriangleI(int r, int c) {

        int n = r - 1;
        c = c - 1;
        int res = 1;
        for(int j = 0; j < n - c; j++)
        {
            res = res * (n - j);
            res = res / (j + 1);

        }

    return res;
w
    }
}

