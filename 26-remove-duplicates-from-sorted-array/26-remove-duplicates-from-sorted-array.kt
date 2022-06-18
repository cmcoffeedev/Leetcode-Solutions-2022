// The idea is to use a two pointer approach
// The left pointer will also be used as a count
// The left pointer will stay on indexes in the array where the number that has not had a duplicate yet
// 1. create a int variable count which will be our left pointer and also keep count of non duplicate values
// 2. loop through the array starting at index 1 (the right pointer starts at index 1, left pointer starts at index 0)
// left pointer = array[count]
// right pointer = array[i]
// 3. if the the left and right values are not equal, we have found a duplicate and can replace the next index after count with right pointers value
// 4. increment count
// 5. array[count] = right
// 5. return count + 1. We need to add one because the grader for this problem loops through the array using size as the length to count up to

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