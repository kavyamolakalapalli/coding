class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        
        ArrayList<String> reverse = new ArrayList<>();
        for(int i = words.length-1;i>=0;i--){
            reverse.add(words[i]);
        }
        
        reverse.removeIf(str -> str.trim().isEmpty());
        String reverseString = String.join(" ",reverse);
        
        return reverseString;
    }
}