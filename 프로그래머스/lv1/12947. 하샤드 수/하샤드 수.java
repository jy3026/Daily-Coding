class Solution {
    public boolean solution(int x) {
        int number = x;
        int num = 0;
        while(x>0){
            num += x%10;
            x = x/10;
        }
        
        if(number%num==0) return true;
        return false;

    }
}