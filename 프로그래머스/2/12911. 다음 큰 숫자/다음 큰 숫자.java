class Solution {
    public int solution(int n) {
        int answer = 0;
        int bignum = 0;
        int count = 1;
        while(true){
            bignum = n+ count;
            
            String twobignum = Integer.toBinaryString(bignum);
            String twon = Integer.toBinaryString(n);
            
            int onecount1 = 0;
            int onecount2 = 0;
            
            for(char arr : twobignum.toCharArray()){
                if(arr == '1') onecount1++;
            }
            for(char arr : twon.toCharArray()){
                if(arr == '1') onecount2++;
            }
            
            if(onecount1 == onecount2) return bignum;
            
            count++;
        }
        
    }
}