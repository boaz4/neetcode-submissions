class Solution {
    public int maxProfit(int[] prices) {
        int l =0, r = 0;
        int sum = 0;
        int ans=0;

        for(r =0; r<prices.length; r++){

            if(prices[r]<prices[l]){

                l = r;
            }
            sum = prices[r] - prices[l];
            ans = Math.max(sum, ans);
        }
        return ans;
    }
}
