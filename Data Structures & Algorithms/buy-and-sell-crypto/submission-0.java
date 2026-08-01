class Solution {
    public int maxProfit(int[] prices) {
        int sum = 0;
        if(prices.length == 1) return 0;
        for(int i =0; i<prices.length -1; i++){
            for(int j=i+1; j<prices.length; j++){
                sum = Math.max(prices[j] - prices[i], sum);
            }
        }
        return sum;
    }
}
