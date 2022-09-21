class Solution {
    fun restoreString(s: String, indices: IntArray): String {
        
        val restored = CharArray(s.length)
        
        s.forEachIndexed{ index, currentChar ->
            val correctIndex = indices[index]
            restored[correctIndex] = currentChar
        }
        
        return String(restored)
    }
}