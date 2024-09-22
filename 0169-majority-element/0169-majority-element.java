class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int ele = nums[0];
        int count = 1;
        for(int i = 1;i<n;i++){
            if(nums[i] == ele){
                count++;
            }
            else if(nums[i] != ele && count != 0){
                count--;
            }
            else{
                ele = nums[i];
                count ++;
            }
        }
        
        return ele;
    }
}