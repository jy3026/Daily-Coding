//문자열의 앞의 n글자

public class Solution11Day15 {
    public static String solution(String my_string, int n) {

        return my_string.substring(0,n);

    }
    public static void main(String[] args) {

        String output = solution("banana",3);
        System.out.println(output);
    }
}
