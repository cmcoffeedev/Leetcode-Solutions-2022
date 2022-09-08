class Solution {
    fun restoreString(s: String, indices: IntArray): String {
        var sArray = s.toCharArray()
        val cArray = CharArray(sArray.size)
        
        for(i in 0 until indices.size){
            val currentChar = sArray[i]
            val currentIndex = indices[i]
            cArray[currentIndex] = currentChar 
        }
        
        return String(cArray)
    }
}