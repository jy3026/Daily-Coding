class Solution {
    public String solution(String s, int n) {
        String answer = "";
        
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c >= 'A' && c <= 'Z') {
                if(c+n > 90){
                    answer += (char)(c+n-26);
                }else answer += (char)(c+n);
            }
            else if(c >= 'a' && c <= 'z') {
                if(c+n > 122){
                    answer += (char)(c+n-26);
                }else answer += (char)(c+n);
            }
            else answer += c;
        }
        
        return answer;
    }
}