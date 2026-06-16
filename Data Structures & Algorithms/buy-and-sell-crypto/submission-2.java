class Solution {
    public int maxProfit(int[] prices) {
        int diff = 0;
        int smallest = Integer.MAX_VALUE;
     
      for(int i = 0 ; i < prices.length ; i++){
        smallest = Math.min(prices[i] , smallest);
        diff = Math.max((prices[i] - smallest) , diff);

      }
      return diff;


    }
}
