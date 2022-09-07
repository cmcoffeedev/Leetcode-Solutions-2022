class Solution {
    fun countMatches(items: List<List<String>>, ruleKey: String, ruleValue: String): Int {
        
        val map = mutableMapOf(
            "type" to 0,
            "color" to 1,
            "name" to 2
        )
        
        val indexToMatch = map[ruleKey]
        
        var matches = 0
        for(list in items){
            indexToMatch?.let{ index->
               if(list[index] == ruleValue) matches++ 
            }
        }
        
        return matches
        
    }
}