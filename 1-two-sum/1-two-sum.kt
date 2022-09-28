class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map = mutableMapOf<Int, Int>()
        nums.forEachIndexed{ index, num ->
            val difference = target - num
            map[difference]?.let{ diffIndex -> 
                return intArrayOf(diffIndex, index)
            }
            map[num] = index
        }
        
        return intArrayOf(-1, -1)
        
        //[2,7,11,15]
     //   [3,2,4],
        
    }
}