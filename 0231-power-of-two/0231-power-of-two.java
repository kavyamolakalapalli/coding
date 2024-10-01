class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n == 1){
            return true;
        }
        int temp = n;
        int count = 0;
        while(temp>0){
            if(temp%2 == 0){
                count += 1;
            }
            temp = temp/2;
        }
        
        if(Math.pow(2,count) == n){
            return true;
        }
        
        return false;
    }
}