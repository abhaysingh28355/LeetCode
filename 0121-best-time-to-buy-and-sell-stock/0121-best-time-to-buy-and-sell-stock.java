class Solution {
    public int maxProfit(int[] prices) {
        int maxprofit = 0;
        int buy  = prices[0];

        for(int i=0;i<prices.length;i++){
            if(buy<prices[i]){
            maxprofit = Math.max(maxprofit,prices[i]-buy);
            } 
            else{
                buy = prices[i];
            }
        }
        return maxprofit;
    }
}