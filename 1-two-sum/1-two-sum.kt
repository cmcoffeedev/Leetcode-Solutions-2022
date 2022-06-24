class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        // a map to hold the number and it's index in the array
        val map = HashMap<Int, Int>() 
        
        for(i in 0 until nums.size){
            val currentNum = nums[i]
            val complement = target - currentNum
            map[complement]?.let{ return intArrayOf(it, i) }
            map.put(currentNum, i)
        }
        
        return intArrayOf(-1,-1)
    }
}