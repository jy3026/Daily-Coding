class Solution {
    boolean solution(String s) {
        int p = 0;
        int y = 0;
        
        s = s.toLowerCase();
        String[] arrs = s.split("");
        
        for(String arr : arrs){
            if(arr.equals("p")) p++;
            else if(arr.equals("y")) y++;
        }
        
        if(p==y) return true;
        else return false;
        

    }
}