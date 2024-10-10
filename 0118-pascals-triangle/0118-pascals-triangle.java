class Solution {
    public List<Integer> list(int row){
        int ans = 1;
        List<Integer> ansRow = new ArrayList<>();
        ansRow.add(1);
        for(int col = 1;col<row;col++){
            ans  = ans *(row - col);
            ans = ans/ (col);
            ansRow.add(ans);
        }
        
        return ansRow;
    }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascaltriangle = new ArrayList<>();
        
        for(int i = 1;i<=numRows;i++){
            pascaltriangle.add(list(i));
        }
        
        return pascaltriangle;
    }
}