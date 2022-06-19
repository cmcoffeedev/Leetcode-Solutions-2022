class Solution {
    public int removeDuplicates(int[] nums) {
        int count = 0;
        int[] duplicate = new int[nums.length];
        duplicate[count++] = nums[0];
        for(int i = 1;i < nums.length;i++){
            int left = nums[i-1];
            int right = nums[i];
            if(left != right) duplicate[count++] = right;
        }
        
        for(int i = 1;i < nums.length;i++){
            nums[i] = duplicate[i];
        }
        return count;
    }
}