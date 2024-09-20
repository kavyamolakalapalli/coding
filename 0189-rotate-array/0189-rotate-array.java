class Solution {
    public void rotate(int[] nums, int k) {
        if(k == 0 || k == nums.length){
            return;
        }
        
        int n = nums.length;
        k = k%n;
        int mid = nums[(n-1)/2];
        int[] temp = new int[k];
        int count = 0;
        
        
        for(int i = n-1;i>0;i--){
            temp[i-(n-k)] = nums[i];
            count++;
            if(count==k){
                break;
            }
        }
        
        for(int i = n-1;i>=k;i--){
            nums[i] = nums[i-k];
        }
        
        for(int i = 0;i<k;i++){
            nums[i] = temp[i];
        }
    }
}