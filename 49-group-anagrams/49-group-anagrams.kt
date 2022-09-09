class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        
        val map = mutableMapOf<String, ArrayList<String>>()
        val list = ArrayList<List<String>>()
        
        for(word in strs){
            val sortedWord = word.split("").sorted().joinToString("")
            val groupList : ArrayList<String> =  map.getOrDefault(sortedWord, ArrayList<String>())
            groupList.add(word)
            map[sortedWord] = groupList
        }
        
        map.forEach{ entry ->
            val groupList = entry.value
            list.add(groupList)
        }
        
        return list
    }
}