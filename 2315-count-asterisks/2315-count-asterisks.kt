class Solution {
    fun countAsterisks(s: String): Int {
        //create a charArray and loop through it
        // var numOfBars = 0
        // var asterickCount
        //once I get to a vertical bar count it,
        // count all asterisks when numOfBars == 1
        // once I get to 2nd bar, set numOfBars = 0 and 
        // ignore characters until I see another bar
        
         var numOfBars = 0
         var asterickCount = 0
         s.forEach{ character->
               if(character == '*' && numOfBars == 0){
                 asterickCount++
             }
             else if(character == '|' && numOfBars == 1){
                 numOfBars = 0 
             }
             else if(character == '|' && numOfBars == 0){
                 numOfBars = 1 
             }
         }
    
         // "l|*e*et|c**o|*de|"
         
         return asterickCount
         
    }
}