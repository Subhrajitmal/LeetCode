class Solution {
    public boolean checkInclusion(String s1, String s2) {

        int m = s1.length();
        int n = s2.length();

        if (m > n) {
            return false;
        }
            int[] wndw1 = new int[26];
            int[] wndw2 = new int[26];

        for (int i = 0; i < m; i++) {
            wndw1[s1.charAt(i)-'a']++;   //here a=97;
            wndw2[s2.charAt(i)- 'a']++;
        }
            if (isEqual(wndw1, wndw2)) {
                return true;
        }
        //Slide the window
        for(int i=s1.length(); i<s2.length(); i++){
            wndw2[s2.charAt(i)-'a']++;  //add new ight character
            wndw2[s2.charAt(i-s1.length())-'a']--;  //remove left character

            if(isEqual(wndw1, wndw2)){  //match the window
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