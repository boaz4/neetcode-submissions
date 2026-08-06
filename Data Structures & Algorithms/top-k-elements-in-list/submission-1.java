class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        PriorityQueue<int[]> q = new PriorityQueue<>((a,b) -> b[1] - a[1]);
        for(int i=0; i<nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        for(int i : map.keySet()){
            q.offer(new int[] {i, map.get(i)});
        }
        int[] ans = new int[k];
        for(int i=0; i<k; i++){
            ans[i] = q.poll()[0];
        }
        return ans;

    }
}
