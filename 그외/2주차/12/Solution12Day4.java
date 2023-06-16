//qr code

public class Solution12Day4 {
    public static String solution(int q, int r, String code) {
        String answer = "";

        String[] arr = code.split("");

        for(int i=0; i<arr.length;i++){
            if(i % q == r) answer += arr[i];
        }


        return answer;
    }
    public static void main(String[] args) {

        String output = solution(2,3,"banana");
        System.out.println(output);
    }
}
