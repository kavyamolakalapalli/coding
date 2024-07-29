class Solution {
    public String removeKdigits(String num, int k) {
        int n = num.length();
        Stack<Character> st = new Stack<>();
        char[] numArray = num.toCharArray();
        for(Character c: numArray){
            while(!st.isEmpty()&&k>0 && st.peek()>c){
                st.pop();
                k--;
            }
            if(!st.isEmpty()||c!='0'){
                st.push(c);
            }
        }
        while(!st.isEmpty() && k>0){
            st.pop();
            k--;
        }
        if(st.isEmpty()){
            return "0";
        }
        
        StringBuilder result = new StringBuilder();
        while (!st.isEmpty()) {
            result.insert(0, st.pop());
        }

        return result.toString();
    }
}