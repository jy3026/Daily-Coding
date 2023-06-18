import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> list = new ArrayList<>();
        
        for(int i=0;i<arr.length;i++){
            if(arr[i] % divisor == 0) list.add(arr[i]);
        }
        
        int[] answer = list.stream().mapToInt(i->i).toArray();
        Arrays.sort(answer);
        
        if(answer.length==0) return new int[]{-1};
        
        return answer;
    }
}