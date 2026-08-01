class Solution {
    public int search(int[] nums, int target) {
        int mid = nums.length / 2;
        int start = 0;
        if(target > nums[mid]) start = mid;
        if(target == nums[mid]) return mid;
        for(int i = start; i<nums.length; i++){
            if(nums[i] == target) return i;
        }
        return -1;
    }
}
