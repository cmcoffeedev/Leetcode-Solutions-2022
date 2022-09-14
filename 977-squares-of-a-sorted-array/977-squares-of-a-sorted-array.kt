class Solution {
    fun sortedSquares(nums: IntArray): IntArray {
        //intArray of the sm
        val squaredNums = IntArray(nums.size)
        //loop throug
        // [ 1 , 3, 6, 8, 11]
        // [ 1 , 9, 36, 64, 121]
        
        // [ -11 , -8, -6, -3, -1]
        // [ -121 , 9, 36, 64, 121]
        
        
       // [-4,-1,0,3,10]
       
       
       //created square num array
        var smallest = Int.MAX_VALUE
        var smallestIndex = 0 
        nums.forEachIndexed{ index, num ->
            squaredNums[index] = num * num
        }
        
        //findd the smallest numbers index 
       // [16,1,0,9,100].
        squaredNums.forEachIndexed{index, num ->
            if(num < smallest ){
                  smallest = num  
                  smallestIndex = index  
            } 
        } 
        
        var left = smallestIndex - 1
        var right = smallestIndex + 1
        var currentIndex = 0
        
        
        val sortedNums = IntArray(squaredNums.size)
        sortedNums[currentIndex++] = smallest 
        
        //[16,1,0,9,100].
        //left = 1
        //right = 3
        
        //left = 0
        //right = 3
        
        //left = 0
        //right = 4
        
        //left -1 
        while(left >= 0 && right < squaredNums.size){
           if(squaredNums[left] < squaredNums[right]){
               sortedNums[currentIndex++] = squaredNums[left--] 
           }
           else{
               sortedNums[currentIndex++] = squaredNums[right++] 
           }
        }
    
     //[16,1,0
         if(right >= squaredNums.size){
            while(currentIndex < squaredNums.size ){
              sortedNums[currentIndex++] = squaredNums[left--]  
            } 
         }
     //0,3,10]
         else if(left < 0){
            while(currentIndex < squaredNums.size ){
                sortedNums[currentIndex++] = squaredNums[right++]  
            }
         }
        
        
         
        
        return sortedNums
        
    }
}