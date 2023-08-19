import java.util.*;

class Solution {
    public int solution(int[][] sizes) {
        int width = 0;
        int length = 0;
        
        for(int i=0;i<sizes.length;i++){
            if(width < Math.max(sizes[i][0],sizes[i][1])) width = Math.max(sizes[i][0],sizes[i][1]);  
            if(length < Math.min(sizes[i][0],sizes[i][1])) length = Math.min(sizes[i][0],sizes[i][1]);
        }
        
        return width*length;
    }
}