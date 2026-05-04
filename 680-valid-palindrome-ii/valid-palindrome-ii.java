class Solution {
    public boolean validPalindrome(String s) {
        int i=0,j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j))
            return CP(s,i+1,j) || CP(s,i,j-1);
            i++;
            j--;
        }
        return true;
    }
    boolean CP(String s, int L, int R){
        while(L<R){
            if(s.charAt(L)!=s.charAt(R)) return false;
            L++;
            R--;
        }
        return true;
    }
}