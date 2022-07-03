class Solution {
    fun runningSum(nums: IntArray): IntArray {
        var sum = 0
        nums.forEachIndexed{ i, num ->
           sum += num 
           nums[i] = sum
        }
        return nums
    }
}