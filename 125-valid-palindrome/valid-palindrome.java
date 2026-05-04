class Solution {
    public boolean isPalindrome(String s) {
       StringBuilder str = new StringBuilder();
       for(char ch:s.toCharArray()){
        if(Character.isLetterOrDigit(ch)){
            str.append(Character.toLowerCase(ch));
        }
       }
       return CP(str.toString());
    }
    private boolean CP(String s){
        int L=0,R=s.length()-1;
        while(L<R){
            if(s.charAt(L)!=s.charAt(R)) return false;
            L++;
            R--;
        }
        return true;
    }
}