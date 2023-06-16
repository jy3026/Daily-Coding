import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;

        String[] nums = String.valueOf(n).split("");
        
        for(String num : nums){
            answer += Integer.parseInt(num);
        }
        

        return answer;
    }
}