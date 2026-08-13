class Solution {
    int[] len, pref, suff, best;
    char[] first, last, s;

    public int[] longestRepeating(String s, String queryCharacters, int[] queryIndices) {
        int n = s.length();
        this.s = s.toCharArray();

        len = new int[4 * n];
        pref = new int[4 * n];
        suff = new int[4 * n];
        best = new int[4 * n];
        first = new char[4 * n];
        last = new char[4 * n];

        build(1, 0, n - 1);

        int[] ans = new int[queryIndices.length];

        for (int i = 0; i < queryIndices.length; i++) {
            int idx = queryIndices[i];
            this.s[idx] = queryCharacters.charAt(i);
            update(1, 0, n - 1, idx);
            ans[i] = best[1];
        }

        return ans;
    }

    void build(int node, int l, int r) {
        if (l == r) {
            len[node] = pref[node] = suff[node] = best[node] = 1;
            first[node] = last[node] = s[l];
            return;
        }

        int mid = (l + r) / 2;

        build(node * 2, l, mid);
        build(node * 2 + 1, mid + 1, r);

        merge(node, node * 2, node * 2 + 1);
    }

    void update(int node, int l, int r, int idx) {
        if (l == r) {
            first[node] = last[node] = s[l];
            len[node] = pref[node] = suff[node] = best[node] = 1;
            return;
        }

        int mid = (l + r) / 2;

        if (idx <= mid)
            update(node * 2, l, mid, idx);
        else
            update(node * 2 + 1, mid + 1, r, idx);

        merge(node, node * 2, node * 2 + 1);
    }

    void merge(int node, int a, int b) {
        len[node] = len[a] + len[b];
        first[node] = first[a];
        last[node] = last[b];

        pref[node] = pref[a];
        suff[node] = suff[b];
        best[node] = Math.max(best[a], best[b]);

        if (last[a] == first[b]) {
            best[node] = Math.max(best[node], suff[a] + pref[b]);

            if (pref[a] == len[a])
                pref[node] = len[a] + pref[b];

            if (suff[b] == len[b])
                suff[node] = len[b] + suff[a];
        }
    }
}