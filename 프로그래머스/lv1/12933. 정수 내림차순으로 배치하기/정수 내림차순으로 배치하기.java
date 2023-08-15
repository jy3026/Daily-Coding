import java.util.*;

class Solution {
    public long solution(long n) {
        String[] nums = String.valueOf(n).split("");
        Arrays.sort(nums,Collections.reverseOrder());
        String number = String.join("",nums);
        
        return Long.valueOf(number);
    }
}