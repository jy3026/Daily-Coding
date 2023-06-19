import java.util.*;

class Solution {
    public int[] solution(String s) {
        int count1 =0;
        int count2 =0;
        
        while(!s.equals("1")){
            int onesCount = 0;
            int zerosCount = 0;
            for (char c : s.toCharArray()) {
                if (c == '1') {
                    onesCount++;
                }else {
                    zerosCount++;
                }
            }
            count1 += zerosCount;
            s = Integer.toBinaryString(onesCount);
            count2++;
        }
        
        int[] answer = new int[]{count2,count1};
        
        return answer;
    }
}