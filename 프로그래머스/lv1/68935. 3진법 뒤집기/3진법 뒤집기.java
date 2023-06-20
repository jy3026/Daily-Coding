import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        String num = "";
        List<Integer> list  = new ArrayList<>();
        
        while(n>0){
            list.add(n%3);
            n = n/3;
        }
        
        for(int i=list.size()-1;i>=0;i--){
            num += String.valueOf(list.get(i));
        }
        
        String[] arr = num.split("");
        
        
        for(int i=0;i<arr.length;i++){
            if(i==0){
                answer += Integer.parseInt(arr[i]) * 1;
            }else{
                answer += Integer.parseInt(arr[i]) * Math.pow(3,i);
            }
            
        }
        
        
        
        System.out.println(num);
        
        return answer;
    }
}