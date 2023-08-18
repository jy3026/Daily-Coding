class Solution {
    public String solution(String s) {
        String answer = "";
        String[] word = s.split(" ",-1);
        
        for(String a : word){
            String[] aph = a.split("");
            long count = 0;
            
            for(String p : aph){
                if(count % 2 == 0) p = p.toUpperCase();    
                else if(count % 2 == 1) p = p.toLowerCase();
                
                answer += p;
                count++;
            }
            answer += " ";
        }
        
        
        return answer.substring(0,answer.length()-1);
    }
}