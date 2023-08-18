import java.util.*;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        int number = 0;
        Arrays.sort(d);
        
        for(int num : d){
            number += num;
            
            if(number > budget) return answer;
            
            answer++;
        }

        
        return answer;
    }
}