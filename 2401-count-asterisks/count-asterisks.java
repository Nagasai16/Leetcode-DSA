class Solution {
    public int countAsterisks(String s) {
        int count = 0;
        int bars = 0;
        for(char c : s.toCharArray()){
            if(c == '|'){
                bars++;
            }
            else if(c=='*' && bars % 2 == 0){
                count++;
            }
        }
        return count;
    }
}