class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
        val map = mutableMapOf<Int,Int>()
        
        nums.forEach{ num -> 
            map[num] = map.getOrDefault(num, 0) + 1
        }
        
        val priorityQueue = PriorityQueue<Int>( compareBy{ map[it] } )
        
        for(key in map.keys){
            priorityQueue.offer(key)
            if(priorityQueue.size > k) priorityQueue.poll()
        }
        
        val topK = IntArray(k)
        for(i in 0 until k) topK[i] = priorityQueue.poll()
        return topK
    }
}