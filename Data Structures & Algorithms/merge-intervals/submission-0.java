class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0], b[0]));
        List<int[]> ans = new ArrayList<>();
        // if(intervals.length == 1) return new int[][] {intervals[0]};
        ans.add(intervals[0]);
        for(int i=1; i<intervals.length; i++){
            int[] arr = intervals[i];
            int start = arr[0];
            int end = arr[1];
            int lastEnd = ans.get(ans.size() - 1)[1];

            if(start<=lastEnd){
                ans.get(ans.size() - 1)[1] = Math.max(end, lastEnd);
            }
            else{
                ans.add(new int[]{start, end});
            }
            
        }

       return ans.toArray(new int[ans.size()][]);

    }
}
