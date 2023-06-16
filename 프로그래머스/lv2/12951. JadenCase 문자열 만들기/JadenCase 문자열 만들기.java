class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        
        char prevChar = ' ';
        
        for(int i=0;i<s.length();i++){
            char currentChar = s.charAt(i);
            
            if(prevChar == ' '){
                sb.append(Character.toUpperCase(currentChar)); 
            }else{
                sb.append(Character.toLowerCase(currentChar));
            }
            
            prevChar = currentChar;
        }
        
        return sb.toString();
        
    }
}