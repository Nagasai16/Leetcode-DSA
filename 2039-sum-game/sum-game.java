class Solution {
    public boolean sumGame(String num) {
        int n = num.length();
        int sum_left=0;
        int sum_right = 0;
        int count_right = 0;
        int count_left = 0;

        for(int i=0;i<n;i++){
            char c = num.charAt(i);
            if(i<n/2){
                if(c=='?'){
                    count_left++;
                }
                else{
                    sum_left += c - '0';
                }
                }
                else{
                    if(c=='?'){
                        count_right++;
                    }
                    else{
                        sum_right += c - '0';
                    }
                }
            }
            if((sum_left - sum_right) * 2 == (count_right - count_left)*9){
                return false;
            }
            return true;
        }
    }
 
    

