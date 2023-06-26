import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        
        
        for(int i=0;i<numbers.length;i++){
            for(int j=i+1;j<numbers.length;j++){
                if(!list.contains(numbers[i]+numbers[j])) list.add(numbers[i]+numbers[j]);
                
                System.out.print(i+j + ",");
            }   
        }
    
        int[] arr = list.stream().mapToInt(i -> i).toArray();
        
        Arrays.sort(arr);
        
        return arr;
    }
}