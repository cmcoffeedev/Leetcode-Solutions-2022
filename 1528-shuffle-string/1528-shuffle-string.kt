class Solution {
    fun restoreString(s: String, indices: IntArray): String {
        var sArray = s.toCharArray()
        val map = mutableMapOf<Int, Char>()
        val sBuilder = StringBuilder()
        
        for(i in 0 until indices.size){
            val currentChar = sArray[i]
            val currentIndex = indices[i]
            map[currentIndex] = currentChar
        }
        
        for(i in 0 until indices.size){
           sBuilder.append( map[i] )
        }
        
        return sBuilder.toString()
    }
}