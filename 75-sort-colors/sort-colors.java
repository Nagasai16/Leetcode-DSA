class Solution {
    public void sortColors(int[] nums) {
       int low = 0, mid = 0, end = nums.length - 1;
    while (mid <= end) {
        if (nums[mid] == 0) {
            int tmp = nums[low];
            nums[low++] = nums[mid];
            nums[mid++] = tmp;
        } else if (nums[mid] == 1) {
            mid++;
        } else {
            int tmp = nums[mid];
            nums[mid] = nums[end];
            nums[end--] = tmp;
        } 
    }
}
}

