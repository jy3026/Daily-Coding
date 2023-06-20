import java.util.*;

class Solution {
    public static String solution(String s) {
        String answer = "";
        List<String> list = new ArrayList<>();
        
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
    
    public static void main(){
        String result = solution("  tRy hello  WORLD    ");
        System.out.println(result);
    }
    
}