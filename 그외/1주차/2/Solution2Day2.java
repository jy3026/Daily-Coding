//문자열을 입력받아 순서가 뒤집힌 문자열을 리턴해야 합니다.

/*
입출력 예시
String output = firstReverse("codestates");
System.out.println(output); // "setatsedoc"

output = firstReverse('I love codestates');
System.out.println(output); // "setatsedoc evol I"
 */
public class Solution2Day2 {

    // 방법 1
    public static String firstReverse1(String str) {
        String result = "";

        for(int i = str.length()-1 ; i >= 0; i--){
            result += str.charAt(i);
        }

        return result;

    }

    // 방법 2 StringBuilder.reverse() 활용
    public static String firstReverse2(String str) {
        StringBuilder sb = new StringBuilder(str);
        String output = sb.reverse().toString();

        return output;

    }

    public static void main(String[] args) {
        String output = firstReverse1("codestates");
        System.out.println(output);
    }
}