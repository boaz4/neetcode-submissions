class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        //[-4,-1,-1,0,1,2]

        for(int i=0; i<nums.length; i++){
            if (nums[i] > 0) break;
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int t = nums[i]*-1;
            int l=i+1, r=nums.length-1;
            while(l<r){
                int sum = nums[i] + nums[l] + nums[r];
                if(sum < 0) l++;
                else if(sum > 0) r--;
                else {
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[l]);
                    temp.add(nums[r]);
                    res.add(temp);
                    r--; l++;
                    while (l < r && nums[l] == nums[l - 1]) {
                        l++;
                    }
                }

            }
        }
        return res;
        
    }
}
