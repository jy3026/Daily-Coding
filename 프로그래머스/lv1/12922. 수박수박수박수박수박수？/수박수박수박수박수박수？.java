class Solution {
    public String solution(int n) {
        String answer = "";
        String prevword = "박";
        
        
        while(n>0){
            String curword= "";
            if(prevword.equals("박")) curword = "수";
            else curword = "박";
            
            answer+=curword;
                
            prevword = curword;
            
            
            n--;
        }
        
        
        return answer;
    }
}