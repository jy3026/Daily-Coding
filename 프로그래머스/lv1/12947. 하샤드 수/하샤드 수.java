class Solution {
    public boolean solution(int x) {
        int num = 0;
        String n = "" + x;
        String[] arrs = n.split("");
        
        for(String arr : arrs){
            num += Integer.parseInt(arr);
        }
        
        if(x%num == 0) return true;
        else return false;
    }
}