
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
      HashMap<Character, Integer> map1 = new HashMap<>();
      HashMap<Character, Integer> map2 = new HashMap<>();

      for(char ch1 : ransomNote.toCharArray()){
        map1.put(ch1, map1.getOrDefault(ch1,0)+1);
      }
        
      for(char ch2 : magazine.toCharArray()){
        map2.put(ch2, map2.getOrDefault(ch2,0)+1);
      }
      for(char ch : map1.keySet()){
      if((!map2.containsKey(ch)) || map2.get(ch) < map1.get(ch)){
        return false;
      }
      }
      return true;
    }
}