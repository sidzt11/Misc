// ________________________________________________________
// Sort An array of 0s 1s and 2s
// ________________________________________________________

class Solution {
    public void sortZeroOneTwo(int[] a) {
        int l = 0, m = 0, r = a.length - 1;

        while (m <= r) {
            if (a[m] == 0) swap(a, l++, m++);
            else if (a[m] == 2) swap(a, m, r--);
            else m++;
        }
    }

    private void swap(int[] a, int i, int j) {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
}

