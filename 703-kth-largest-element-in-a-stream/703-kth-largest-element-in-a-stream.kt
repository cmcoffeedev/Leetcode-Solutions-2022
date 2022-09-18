class KthLargest(k: Int, nums: IntArray) {
    
    val pq = PriorityQueue<Int>()
    val t = k
    
    init{
       for(num in nums){
           pq.offer(num)
           if(pq.size > k) pq.poll()
       } 
    }

    fun add(`val`: Int): Int {
       pq.offer(`val`)
       if(pq.size > t) pq.poll()
       return pq.peek()
    }

}

/**
 * Your KthLargest object will be instantiated and called as such:
 * var obj = KthLargest(k, nums)
 * var param_1 = obj.add(`val`)
 */