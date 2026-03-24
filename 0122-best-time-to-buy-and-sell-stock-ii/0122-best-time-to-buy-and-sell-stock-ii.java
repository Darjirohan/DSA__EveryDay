class Solution {
    private int profit1(int[] prices){
    int profit=0;
    for(int i=0;i<prices.length-1;i++){
        if(prices[i]<prices[i+1]){
            int pr=(prices[i+1] - prices[i]);
            profit+=pr;
        }
    }   
    return profit;
    }
    public int maxProfit(int[] prices) {
    return profit1(prices);
    }
}