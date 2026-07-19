class Solution {
    public boolean checkInclusion(String s1, String s2) {

        int m = s1.length();
        int n = s2.length();

        if (m > n) {
            return false;
        }

        for (int i = 0; i <= n - m; i++) {

            int[] freq1 = new int[26];
            int[] freq2 = new int[26];

            for (int j = 0; j < m; j++) {
                freq1[s1.charAt(j) - 'a']++;
                freq2[s2.charAt(i + j) - 'a']++;
            }

            if (isEqual(freq1, freq2)) {
                return true;
            }
        }

        return false;
    }

    private boolean isEqual(int[] a, int[] b) {
        for (int i = 0; i < 26; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }
        return true;
    }
}