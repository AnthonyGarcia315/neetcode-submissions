class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        //int sol[2];
        //int j =1;
        for(int i=0;i<nums.length;i++){
        for(int k=i+1;k<nums.length;k++){
            if(nums[i]+nums[k]==target){
                return new int[]{i,k};
            }

        }
        }
        return new int[]{0,0};
    }
}
