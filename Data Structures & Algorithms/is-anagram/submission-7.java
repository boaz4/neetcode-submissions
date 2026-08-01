class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!= t.length()) return false;
        HashMap<Character, Integer> map = new HashMap<>();

        for(Character c : s.toCharArray()){
            if(map.containsKey(c)){
                map.put(c, map.get(c) + 1);
            } else map.put(c, 1);
        }

        for(Character c : t.toCharArray()){
            if(map.get(c) == null) return false;
            else map.put(c, map.get(c) - 1);
        }

        for(int i : map.values()){
            if(i != 0) return false;
        }
        return true;
    }
}
