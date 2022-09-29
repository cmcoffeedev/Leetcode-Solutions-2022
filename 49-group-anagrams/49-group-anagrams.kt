class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        
        val map = mutableMapOf<String, MutableList<String>>()
        
        for(word in strs){
            val sortedWord = word.split("").sorted().joinToString("")
            if(!map.containsKey(sortedWord)) map[sortedWord] = mutableListOf()
            map[sortedWord]?.add(word)
        }
        
        return map.values.toList()
    }
}
// ["eat","tea","tan","ate","nat","bat"]
// "nat","tan"
// ant, ant = [nat, tan]