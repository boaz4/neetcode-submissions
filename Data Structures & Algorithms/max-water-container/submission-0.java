class Solution {
    public int maxArea(int[] heights) {
        int max = 0, l=0, r=heights.length-1;

        while(l<r){
            int width = r-l;
            int minHeight = Math.min(heights[l], heights[r]);
            max = Math.max(max, width*minHeight);
            if(heights[l] < heights[r]) l++;
            else r--;
        }
        return max;
    }
}
