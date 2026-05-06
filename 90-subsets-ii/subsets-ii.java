class Solution {
    List<List<Integer>>res = new ArrayList<>();
    List<Integer>temp= new ArrayList();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
         Arrays.sort(nums);
         Backtrack(0,nums);
         return res;
    }
    private void Backtrack(int idx, int[] nums){
        res.add(new ArrayList<>(temp));
        for(int i=idx;i<nums.length;i++){
            if(i>idx && nums[i]==nums[i-1]){
                continue;
            }
            temp.add(nums[i]);
            Backtrack(i+1,nums);
            temp.remove(temp.size()-1);
        }
    }
}