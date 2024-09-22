class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> mpp = new HashMap<>();
        int n = nums.length;
        for(int i = 0;i<n;i++){
            if(mpp.containsKey(nums[i])){
                int value = mpp.get(nums[i]);
                mpp.put(nums[i],value+1);
            }
            else{
                mpp.put(nums[i],1);
            }
        }
        
        for(Map.Entry<Integer,Integer> ele: mpp.entrySet()){
            if(ele.getValue() > n/2){
                return ele.getKey();
            }
        }
        
        return 0;
    }
}