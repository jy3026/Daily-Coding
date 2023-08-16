import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int[1];
        if(arr.length == 1) return answer = new int[]{-1};
        
        int min = Integer.MAX_VALUE;
        
        for(int num : arr){
            if(min > num) min = num;
        }
        
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i] != min) list.add(arr[i]);
        }
        
        int[] result = list.stream().mapToInt(i->i).toArray();
        
        
        return result;
    }
}