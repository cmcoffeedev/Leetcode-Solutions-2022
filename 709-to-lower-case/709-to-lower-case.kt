class Solution {
    fun toLowerCase(s: String): String {
        
        val sChars = s.toCharArray()
        val sBuilder = StringBuilder()
        for(character in sChars){
            if(character >= 'A' && character <= 'Z'){
               sBuilder.append((character + 32)) 
            }
            else{
               sBuilder.append(character) 
            }
        }
        
        return sBuilder.toString()
        
    }
}