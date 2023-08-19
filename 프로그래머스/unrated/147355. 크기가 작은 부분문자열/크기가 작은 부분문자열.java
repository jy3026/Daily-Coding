class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int num = p.length();
        
        for(int i=0;i<=t.length()-p.length();i++){
            long number = Long.valueOf(t.substring(i,num));
            if(Long.valueOf(p) >= number) answer++;
            num++;
        }
        
        return answer;
    }
}