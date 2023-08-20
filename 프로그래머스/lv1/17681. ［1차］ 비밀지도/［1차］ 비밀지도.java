class Solution {
    public String change(String num){
        String ch ="";
        
        for(int i=0;i<num.length();i++){
            if(num.charAt(i) == '1'){
                ch += '#';
            }else if(num.charAt(i) == '0'){
                ch += ' ';
            }
        }
        
        return ch;
    }
    
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[arr1.length];
        
        for(int i=0;i<arr1.length;i++){
            String num = Integer.toBinaryString(arr1[i] | arr2[i]);
            
            if(num.length() != arr1.length){
                String space = "0";
                for(int j=0;j<=(arr1.length-num.length());j++){
                    num = space + num;
                }
            }
            
            answer[i] = change(num);
        }
        
        return answer;
    }
}