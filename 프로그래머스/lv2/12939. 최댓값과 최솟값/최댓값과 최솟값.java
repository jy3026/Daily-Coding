class Solution {
    public String solution(String s) {
        String answer = "";
        
        
        String[] nums = s.split(" ");
        
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        for(int i=0;i<nums.length;i++){
            if(Integer.parseInt(nums[i]) > max) max=Integer.parseInt(nums[i]);
            
            if(Integer.parseInt(nums[i]) < min) min=Integer.parseInt(nums[i]);
        }
        
        answer = String.valueOf(min) + " " + String.valueOf(max);
        
        return answer;
    }
}