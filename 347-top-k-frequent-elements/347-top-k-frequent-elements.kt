class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
        
        val map = mutableMapOf<Int, Int>()
        
        //add the count of each number to the map
        nums.forEach{ num ->
            map[num] = map.getOrDefault(num, 0) + 1
        }
        
        //custom comparator to use the count of the numbers as the priority
        val maxHeap = PriorityQueue<Int>( compareByDescending { map[it] } )
        
        //add the keys( each number ) to the heap based on the count in the map 
        for( key in map.keys ){
            maxHeap.offer(key)
        }
        
        //create an array that is the size of k
        val topK = IntArray(k)
        
        //add the first k elements in the maxHeap to the array
        //(problem statement mentions order does not matter)
        for( i in 0 until k ){
          topK[i] = maxHeap.poll()  
        } 
        
        return topK
        
        
    }
}