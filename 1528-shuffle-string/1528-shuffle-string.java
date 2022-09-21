class Solution {
    public String restoreString(String s, int[] indices) {
        char[] sArray = s.toCharArray();
        char[] restored = new char[sArray.length];
        
        for(int i = 0;i < sArray.length; i++){
            Character character = sArray[i];
            int currentIndex = indices[i];
            restored[currentIndex] = character;
        }
        
        return String.valueOf(restored);
    }
}