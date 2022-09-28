class Solution {
    fun threeSum(nums: IntArray): List<List<Int>> {
        // can't use the same index, but can have the same value at a diff index
        // return values instead of indexes
        // 3 values must equal 0 ; nums[i] + nums[j] + nums[k] == 0
        
        // 1st loop - check each number
        // 2nd loop - find the same number
        // 3rd loop - 
        // j > i , k > j
        
        // map of the sum 
        //  [-1,0,1,2,-1,-4]
        // -1 + 0 = -1 , map
        // 0 - - 1 = 1
        // 0 - 1 = -1
        
        
        val set = HashSet<List<Int>>()
        
        val list = mutableListOf< List<Int> >()
        
        val map = mutableMapOf<Int, Int>()
        nums.forEachIndexed{ index, num ->
            map[num] = index
        }
        
        for(i in 0 until nums.size){
            val one = nums[i] //-1
            for(j in i+1 until nums.size){
                val two = nums[j]
                val sum = one + two
                val three = 0 - sum
                map[three]?.let{ thirdIndex ->
                   if( thirdIndex != i && thirdIndex != j){
                       val innerList = listOf(one, two, three).sorted()
                       if(!set.contains(innerList)){
                           list.add(innerList) 
                           set.add(innerList)
                       }    
                   }
                }
            }
        }
        
        //one = -1, two = 0, sum = -1, three = (0 - - 1) = 1
        //one = -1, two = 2, sum = 1, three = (0 - 1) = -1
        
        return list
         //  [-1,0,1,2,-1,-4]
        
        
    }
}