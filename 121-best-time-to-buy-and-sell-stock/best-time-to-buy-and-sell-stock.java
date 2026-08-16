class Solution {
    public int maxProfit(int[] prices) {
        int min_price = prices[0];
        int max_profit = 0;
        for(int i=0;i<prices.length;i++){
            if(prices[i] < min_price){
                min_price = prices[i];
            }
            else{
              int s =  (prices[i] - min_price);
              if(s>max_profit){
                max_profit = s;
              }
            }
        }
        return max_profit;
    }
}