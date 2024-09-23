class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int maxsize = Integer.MIN_VALUE;
        
        for(int ele: nums){
            sum += ele;
            maxsize = Math.max(maxsize,sum);
            if(sum<0){
                sum = 0;
            }
        }
        
        return maxsize;
    }
}