import java.util.*;

class Solution {
    public int[] solution(int[] arr) {

        List<Integer> list = new ArrayList<>();
        
        int min = Integer.MAX_VALUE;
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min) min = arr[i];
        }
        
        for(int i=0;i<arr.length;i++){
            if(!(arr[i] == min)) list.add(arr[i]);
        }
        
        int[] result = list.stream().mapToInt(i->i).toArray();
        
        if(result.length ==0) return new int[]{-1};
        
        
        return result;
    }
}