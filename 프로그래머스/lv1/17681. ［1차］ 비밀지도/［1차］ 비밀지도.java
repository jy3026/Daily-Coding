class Solution {
    public String[] addZero(String bin,int n){
        if(bin.length() != n) {
            String zero = "";
            for(int i=0; i<n-bin.length(); i++) {
                zero += "0";
            }
            bin = zero + bin;
        }

        return bin.split("");
        
    }
    
    
    
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        
        for(int i =0;i<n;i++){
            String a1 = Integer.toBinaryString(arr1[i]);
            String a2 = Integer.toBinaryString(arr2[i]);
            
            String[] num1 = addZero(a1,n);
            String[] num2 = addZero(a2,n);
            
            String plus = "";
            
            for(int j=0;j<n;j++){
                if(num1[j].equals("1") || num2[j].equals("1")) plus += "#";
                else plus += " ";
            }
            
            answer[i] = plus;
            
        }
        
        return answer;
    }
}