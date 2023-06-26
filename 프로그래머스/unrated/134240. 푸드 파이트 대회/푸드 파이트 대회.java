import java.util.*;

class Solution {
    public String solution(int[] food) {
        String answer = "";
        
        List<Integer> list = new ArrayList<>();
        
        for(int i=1;i<food.length;i++){
            for(int j=0;j<food[i]/2;j++){
                list.add(i);
            }
        }
        
        String[] arr = list.stream().map(i -> Integer.toString(i)).toArray(String[]::new);
        
        answer = String.join("",arr);
        
        answer += "0";
        
        Arrays.sort(arr,Collections.reverseOrder());
        
        answer += String.join("",arr);
        
        return answer;
    }
}