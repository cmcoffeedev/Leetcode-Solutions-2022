class Solution {
    fun pivotIndex(nums: IntArray): Int {
        var sum = 0
        var leftSum = 0
        
        nums.forEach{ num -> 
            sum += num
        }
        
        nums.forEachIndexed{ i, currentNum ->
            val rightSum = sum - leftSum - currentNum 
            if(rightSum == leftSum) return i
            leftSum += currentNum
        }
        
        return -1
    }
}