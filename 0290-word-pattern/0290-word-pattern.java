import java.util.HashMap;
class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] s1 = s.split(" ");
        if(pattern.length() != s1.length){
            return false;
        }
        HashMap<Character, String> map1 =  new HashMap<>();
         HashMap<String, Character> map2 =  new HashMap<>();
        for(int i=0; i<pattern.length(); i++){
            char ch1 = pattern.charAt(i);
            String s2 = s1[i];

            if(map1.containsKey(ch1)){
                if(!map1.get(ch1).equals(s2)){
                    return false;
                }
            } else{
                map1.put(ch1,s2);
            }

            if(map2.containsKey(s2)){
                if(map2.get(s2) != ch1){
                    return false;
                }
            } else{
                map2.put(s2,ch1);
            }
        }
        return true;
    }
}