import java.util.HashMap;
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
     HashMap<Character,Integer> map = new HashMap<>();
        for(char ch1: s.toCharArray()){
            map.put(ch1,map.getOrDefault(ch1,0)+1);
        }
        for (char ch : t.toCharArray()) {

            if (!map.containsKey(ch)) {
                return false;
            }

            map.put(ch, map.get(ch) - 1);

            if (map.get(ch) == 0) {
                map.remove(ch);
            }
        }

        return map.isEmpty();
}
}