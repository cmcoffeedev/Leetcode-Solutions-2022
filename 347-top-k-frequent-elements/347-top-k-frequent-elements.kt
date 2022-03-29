class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
        
        val map = mutableMapOf<Int, Int>()
        
        //add the count of each number to the map
        nums.forEach{ num ->
            map[num] = map.getOrDefault(num, 0) + 1
        }
        
        //create a min heap priority queue using a custom comparator
        val minHeap = PriorityQueue<Int>( compareByDescending { map[it] } )
        
        //add the keys( each number ) to the heap based on the count in the map 
        // if the minheap size is bigger than k, we want to remove the first element,
        // because now there could be a new count and we want the top k
        for( key in map.keys ){
            minHeap.offer(key)
            //if(minHeap.size > k) minHeap.poll()
        }
        
        //create an array that is the size of k
        val topK = IntArray(k)
        
        //add the first k elements in the minHeap to the array
        //(problem statement mentions order does not matter)
        for( i in 0 until k ){
          topK[i] = minHeap.poll()  
        } 
        
        return topK
        
        
    }
}