import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String num = "" + n;
        
        Long[] arr = new Long[num.length()];
        
        int index = 0;
        
        while(n > 0){
            arr[index] = n%10;
            
            n /= 10;
            
            index++;
        }
        
        Arrays.sort(arr,Collections.reverseOrder());
        
        String result = "";
        
        for(long number : arr){
            result += String.valueOf(number);
        }
        
        answer = Long.parseLong(result);
        
        return answer;
    }
}