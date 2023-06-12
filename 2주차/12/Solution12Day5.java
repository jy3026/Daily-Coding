//문자 개수 세기

public class Solution12Day5 {
    public static int[] solution(String my_string) {
        int[] answer = {};

        int[] arr = new int[52];


        for(int i=0;i<my_string.length();i++){
            char ch = my_string.charAt(i);
            if (ch >= 97) {
                arr[ch - 97 + 26]++;  // 소문자인 경우
            } else {
                arr[ch - 65]++;  // 대문자인 경우
            }
        }

        return arr;
    }
    public static void main(String[] args) {

        int[] output = solution("Programmers"	);
        System.out.println(output);
    }
}
