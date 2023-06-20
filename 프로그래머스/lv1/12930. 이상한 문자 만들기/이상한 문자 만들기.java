import java.util.*;

class Solution {
    public static String solution(String s) {
        String answer = "";
        List<String> list = new ArrayList<>();
        
        //문자열.split(" ", -1)와 같이 호출하면 마지막에 오는 빈 문자열도 포함
        String[] arrs = s.split(" ", -1);
        
        for(int i=0;i<arrs.length;i++){
            String[] arr = arrs[i].split("");
            
            for(int j=0;j<arr.length;j++)
            {
                if(j%2 == 0) arr[j] = arr[j].toUpperCase();
                else arr[j] = arr[j].toLowerCase();
            }
            
            list.add(String.join("",arr));
        }        
        
        return String.join(" ",list);
    }    
}