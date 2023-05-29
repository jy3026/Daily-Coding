//문자열을 입력받아 문자열을 구성하는 각 단어의 첫 글자로 이루어진 문자열을 리턴해야 합니다.

/*
입출력 예시
String output = firstCharacter("hello world");
System.out.println(output); // --> "hw"

output = firstCharacter(
  "The community at Code States might be the biggest asset"
);
System.out.println(output); // --> "TcaCSmbtba"
 */
public class Solution2Day {
    public static String firstCharacter(String str) {
        if(str.length() == 0) return "";

        String result = "";
        result += str.charAt(0);

        for(int i=0;i < str.length();i++){
            if(str.charAt(i) == ' '){
                result += str.charAt(i+1);
            }
        }

        return result;
    }

    public static void main(String[] args) {

        String output = firstCharacter("hello world");
        System.out.println(output);
    }
}