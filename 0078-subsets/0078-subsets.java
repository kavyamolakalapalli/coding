class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        
        List<List<Integer>> sub = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        int n = nums.length-1;
        int ind = 0;
        
        print(ind,sub,current,nums);
        
        return sub;
        
    }
    
    public static void print(int ind,List<List<Integer>> sub,List<Integer> current,int[] nums){
        sub.add(new ArrayList<>(current));
        
        for (int i = ind; i < nums.length; i++) {
            current.add(nums[i]);
            
            print(i + 1, sub, current, nums);
            
            current.remove(current.size() - 1);
        }
    }
    
    
}