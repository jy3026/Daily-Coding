//코드 처리하기
public class Solution10Day {
    public static String solution(String code) {
        String result = "";
        int mode = 0;
        String[] codeArr = code.split("");

        for(int i =0; i<codeArr.length;i++){
            if(codeArr[i].equals("1")){
                if(mode == 0) mode = 1;
                else mode = 0;
            }else{
                if(mode == 0){
                    if(i%2==0) {
                        result += codeArr[i];
                    }
                }else if(mode == 1){
                    if(i%2==1) {
                        result += codeArr[i];
                    }
                }
            }

        }
        if(result.equals("")) return "EMPTY";


        return result;
    }
    public static void main(String[] args) {

        String output = solution("abc1abc1abc");
        System.out.println(output);
    }
}
