class Solution {
    fun removeElement(nums: IntArray, `val`: Int): Int {
        /*
        nums = [3,2,2,3], val = 3
        nums= [2,2], val = 3
        */
           //val prev = nums[i-1]
       var validNums = 0 
        val lastIndex = nums.size-1
         var lastValidIndex = lastIndex //3, //3
       for(currentIndex in 0 until nums.size){
           val current = nums[currentIndex] //3, //2, //3
           if(current == `val`){
               
              
               while(lastValidIndex >= 0 && nums[lastValidIndex] ==  `val`){
                    lastValidIndex-- //2,
                   //2, //1
               }
               
               if(lastValidIndex <= currentIndex) break
               
               
               val last = nums[lastValidIndex] //nums[2] = 2
               //swap current index with lastValidIndex's num
               nums[currentIndex] = last //nums[0] = 2
               //swap lastValidIndex with the current num
               nums[lastValidIndex] = current //nums[2] = 2
               
               //2,2,3,3
               //validNums = 1
               
               //initial = [0,1,2,2,3,0,4,2], val = 2
               //[0,1,2,2,3,0,4,5], val = 2
               //[0,1,5,2,3,0,4,2], val = 2
               //[0,1,5,4,3,0,2,2], val = 2
               //     i
               //[0,1,2,3,0,4,2,2], val = 2
               //     i
               //[0,1,3,0,4,2,2,2], val = 2
              
           }
           
           validNums++ 
               //validNums = 1
               //validNums = 2
       }
       
       return validNums
    }
}