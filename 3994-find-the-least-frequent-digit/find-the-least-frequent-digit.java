class Solution {
    public int getLeastFrequentDigit(int n) {
        int[] freq = new int[10];
        while(n>0){
            int d = n%10;
            freq[d]++;
            n /= 10;
        }
        int minFreq = Integer.MAX_VALUE;
        int ans = -1;
        for(int i=0;i<10;i++){
            if(freq[i] > 0 && freq[i] < minFreq){
                minFreq = freq[i];
                ans = i;
            }
        }
        return ans;
    }
}