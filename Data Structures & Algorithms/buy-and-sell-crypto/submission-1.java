class Solution {
    public int maxProfit(int[] prices) {

        int n = prices.length;

        int maxProfit = 0;
        int minProfit = Integer.MAX_VALUE;
        for(int i=0; i<n; i++){
            minProfit = Math.min(minProfit, prices[i]);
            maxProfit = Math.max(maxProfit, prices[i] - minProfit);
        }
       

        return maxProfit;
        
        
    }
}
