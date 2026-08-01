class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();

        for(int i=0; i<s.length(); i++){
            Character c = s.charAt(i);
            if(map.containsKey(c)){
                map.put(c, map.get(c) + 1);
            } else map.put(c, 1);
        }
        for(int i=0; i<t.length(); i++){
            Character c = t.charAt(i);
            if(map.containsKey(c)){
                map.put(c, map.get(c) - 1);
            } else map.put(c, 1);
        }
            System.out.println(map.values());


        for(Integer j : map.values()){
            if(j!= 0) return false;
        }
        return true;
    }
}
