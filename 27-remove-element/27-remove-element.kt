class Solution {
    fun removeElement(nums: IntArray, `val`: Int): Int {
        var validSize = 0
        for(num in nums){
            if(num != `val`){
                nums[validSize++] = num
            }
        }
        return validSize
    }
}