class Solution {
    fun countMatches(items: List<List<String>>, ruleKey: String, ruleValue: String): Int {
        
        val indexToMatch = when(ruleKey){
            "type" -> 0
            "color" -> 1
            else -> 2
        }
        
        var matches = 0
        for(list in items){
           if(list[indexToMatch] == ruleValue) matches++ 
        }
        
        return matches
    }
}