class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> Checked=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(Checked.contains(nums[i])){
                //returns true if there are duplicates
                return true;
            }
            //returns false if no duplicates
            Checked.add(nums[i]);
        }
        return false;
    }
}