import java.util.*;

class Solution {
    public long[] solution(int x, int n) {
        List<Long> list = new ArrayList<>();
        
        long num = x;
        
        for(int i=0;i<n;i++){
            list.add(num);
     
            num += x;  
        }
        
        long[] arr = new long[list.size()];
        
        for(int i=0;i<arr.length;i++){
            arr[i] = list.get(i);
        }
        
        
        return arr;
    }
}