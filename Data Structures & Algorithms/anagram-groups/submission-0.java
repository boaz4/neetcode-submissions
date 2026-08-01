class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            List<String> group = map.getOrDefault(key, new ArrayList<>());
            group.add(s);
            map.put(key, group);
        }

        return new ArrayList<>(map.values());
    }
}
