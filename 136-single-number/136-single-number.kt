class Solution {
    fun singleNumber(nums: IntArray): Int {
        
        val map = mutableMapOf<Int, Int>()
        
        for(num in nums){
            map[num] = map.getOrDefault(num, 0) + 1
        }
        
        for(num in nums){
            map[num]?.let{
                if(it == 1) return num
            }
        }
        
        return Int.MIN_VALUE
        
    }
}