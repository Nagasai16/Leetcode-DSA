class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int totalSum = 0;
        int n = arr.length;
        for(int i=0;i<n;i++){
            int tSubarrays = (i+1) * (n-i);
            int oddSubarrays = (tSubarrays+1)/2;
            totalSum += oddSubarrays *arr[i];
        }
        return totalSum;
    }
}