class Solution {
    fun removeDuplicates(nums: IntArray): Int {
        var count = 0
        for(i in 1 until nums.size){
            val left = nums[count]
            val right = nums[i]
            if(left != right){
                nums[++count] = right
            }
        }
        
        return count + 1
    }
}