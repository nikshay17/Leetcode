public class Solution {
    public int findContentChildren(int[] g, int[] s) {
        if (s.length == 0) return 0;

        Arrays.sort(g);
        Arrays.sort(s);

        int M = 0;
        int i = 0;
        int j = 0;

        while (i < g.length && j < s.length) {
            if (s[j] >= g[i]) {
                M++;
                i++;
            }
            j++;
        }

        return M;
    }
}