class Solution {
    public String[] createGrid(int m, int n) {
      String[] grid = new String[m];
      char[] r = new char[n];
      for(int j=0; j<n; j++){
        r[j] = '#';
      }  
      for(int i=0; i<m; i++){
        grid[i] = new String(r);
      }
      char[] first = grid[0].toCharArray();
      for(int j=0; j<n; j++){
        first[j] = '.';
      }
      grid[0] = new String(first);
      for(int i=0; i<m; i++){
        char[] c= grid[i].toCharArray();
        c[n-1] = '.';
        grid[i] = new String(c);
      }
      return grid;
    }
}