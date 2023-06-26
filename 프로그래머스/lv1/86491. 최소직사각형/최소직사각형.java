class Solution {
    public int solution(int[][] sizes) {
        int max = 0;
        int min = 0;
        for(int i=0;i<sizes.length;i++){
            int maxnum = Math.max(sizes[i][0],sizes[i][1]);
            int minnum = Math.min(sizes[i][0],sizes[i][1]);
            
            if(maxnum > max) max = maxnum;
            if(minnum > min) min = minnum;
        }
        
        return max*min;
    }
}