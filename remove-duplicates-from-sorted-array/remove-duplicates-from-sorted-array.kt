class Solution {
    fun removeDuplicates(nums: IntArray): Int {
        var k = 0
        for(i in 1 until nums.size){
           if(nums[i] != nums[i-1]){
               nums[++k] = nums[i]
           } 
        }
        return k+1
    }
}