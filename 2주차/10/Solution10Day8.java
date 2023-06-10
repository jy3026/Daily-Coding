//수 조작하기 2
public class Solution10Day8 {
    public static String solution(int[] numLog) {
        String answer = "";

        for(int i=0;i<numLog.length-1;i++){
            int num = numLog[i+1] - numLog[i];

            switch (num){
                case 1:
                    answer += "w";
                    break;
                case -1:
                    answer += "s";
                    break;
                case 10:
                    answer += "d";
                    break;
                case -10:
                    answer += "a";
                    break;
            }
        }


        return answer;
    }
    public static void main(String[] args) {

        String output = solution(new int[]{0, 1, 0, 10, 0, 1, 0, 10, 0, -1, -2, -1});
        System.out.println(output);
    }
}
