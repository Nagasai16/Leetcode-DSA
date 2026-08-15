class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = 0;
        int target;
        for(int i=0;i<n;i++){
            sum += nums[i];
        }
        target = n*(n+1)/2;
        int res = target - sum;

        return res;
    }
    
}