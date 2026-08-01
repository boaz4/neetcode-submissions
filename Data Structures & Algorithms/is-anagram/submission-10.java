class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!= t.length()) return false;
        int[] counts = new int[26];
        for(Character c : s.toCharArray()){
            counts[c-'a']++;
        }

        for(Character c : t.toCharArray()){
            if(counts[c-'a'] == 0) return false;
            counts[c-'a']--;
        }

        for(int i : counts){
            if(i != 0) return false;
        }
        return true;
    }
}
