import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        String three = Integer.toString(n,3);
        
        StringBuilder sb = new StringBuilder(three);
        
        String result = sb.reverse().toString();
        
        answer = Integer.parseInt(result,3);
        
        return answer;
    }
}