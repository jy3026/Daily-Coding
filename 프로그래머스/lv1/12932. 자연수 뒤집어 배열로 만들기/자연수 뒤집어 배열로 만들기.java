import java.util.*;

class Solution {
    public int[] solution(long n) {
        
        String[] nums = String.valueOf(n).split("");
        
        int[] num = Arrays.stream(nums).mapToInt(i-> Integer.parseInt(i)).toArray();
        
        List<Integer> list = new ArrayList<>();
        
        for(int i=nums.length-1;i>=0;i--){
            list.add(num[i]);
        }
        
        for(int i=0;i<num.length;i++){
            num[i] = list.get(i);
        }

        
        
        return num;
    }
}