class Solution {
    public int maxProfit(int[] prices) {
        int i = 0;
        int j=1;
        int n = prices.length;
        int m = 0;
        while (j<n){
            if (prices[i]>prices[j]){
                i=j;
            }
            else{
                m = Math.max(m,prices[j]-prices[i]);
                j+=1;
            }
        }
        
        return m;
    }
}