class Solution {
    fun plusOne(digits: IntArray): IntArray {
        var carry = 1
        for(i in digits.size-1 downTo 0){
            val current = digits[i] 
            val sum = current + carry
            carry = sum / 10
            digits[i] = sum % 10
        }
        
        if(carry > 0){
            val plusOneArray = IntArray(digits.size+1)
            plusOneArray[0] = carry
            for(i in 1 until digits.size){
                plusOneArray[i] = digits[i-1]
            }
            return plusOneArray
        }
        
        return digits

    }
}