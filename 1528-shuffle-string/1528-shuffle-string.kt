class Solution {
    fun restoreString(s: String, indices: IntArray): String {
        
        val sArray = s.toCharArray()
        val restored = CharArray(sArray.size)
        
        sArray.forEachIndexed{ index, currentChar ->
            val correctIndex = indices[index]
            restored[correctIndex] = currentChar
        }
        
        return String(restored)
    }
}