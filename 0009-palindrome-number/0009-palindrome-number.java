class Solution {
    public boolean isPalindrome(int x) {
        int reverseNumber = 0;
        int temp = x;
        while(temp>0){
            
            int lastdigit = temp%10;
            reverseNumber = (reverseNumber*10) + lastdigit;
            temp = temp/10;
        }
        
        if(x == reverseNumber){
            return true;
        }
        else{
            return false;
        }
    }
}