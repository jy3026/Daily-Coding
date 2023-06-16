//배열 만들기 5
import java.util.*;
public class Solution11Day10 {
    public static int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> result = new ArrayList<>();


        for(String intStr : intStrs){
            String[] arr = intStr.split("");
            String num = "";

            for(int i=s;i< s+l ; i++){
                num += arr[i];
            }

            if(Integer.parseInt(num) > k){
                result.add(Integer.parseInt(num));
            }

        }

        int[] answer = new int[result.size()];

        for(int i=0;i<answer.length;i++){
            answer[i] = result.get(i);
        }

        return answer;
    }
    public static void main(String[] args) {

        String output = solution(new int[]{"0123456789","9876543210","9999999999999"},50000,5,5);
        System.out.println(output);
    }
}
