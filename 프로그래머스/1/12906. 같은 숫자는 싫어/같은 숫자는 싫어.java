import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        List<Integer> list = new ArrayList<>();
        
        int before = Integer.MAX_VALUE;
        for(int num : arr){
            if(before != num) list.add(num);
            
            before = num;
        }
        
        int[] answer = list.stream().mapToInt(i -> i).toArray();
        
        return answer;
    }
}