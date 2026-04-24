class Solution {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        

        for(int i = 0 ; i<prices.length;i++){
            min = Math.min(prices[i],min);
             
             max = Math.max((prices[i]-min) , max);
            
        }

        return max;
        
    }
}
