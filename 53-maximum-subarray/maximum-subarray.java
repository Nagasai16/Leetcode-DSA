class Solution {
    public int maxSubArray(int[] nums) {
        int cSum = nums[0];
        int mSum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            cSum = Math.max(nums[i], cSum + nums[i]);
            mSum = Math.max(mSum, cSum);
        }
        return mSum;
    }
    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        Solution sol = new Solution();
        System.out.println(sol.maxSubArray(nums));
    }
}
