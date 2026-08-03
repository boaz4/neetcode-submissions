class Solution {
   public int characterReplacement(String s, int k) {
    HashMap<Character, Integer> map = new HashMap<>();
    int l = 0;
    int max = 0;
    int maxFrequency = 0;

    for (int r = 0; r < s.length(); r++) {
        map.put(s.charAt(r), map.getOrDefault(s.charAt(r), 0) + 1);

        maxFrequency = Math.max(maxFrequency, map.get(s.charAt(r)));

        while ((r - l + 1) - maxFrequency > k) {
            map.put(s.charAt(l), map.get(s.charAt(l)) - 1);
            l++;
        }

        max = Math.max(max, r - l + 1);
    }

    return max;
}
}
