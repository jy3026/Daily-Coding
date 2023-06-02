//문자열을 입력받아 해당 문자열에 등장하는 두 칸의 공백을 모두 한 칸의 공백으로 바꾼 문자열을 리턴해야 합니다.

/*
입출력 예시
String output = convertDoubleSpaceToSingle("string  with  double  spaces");
System.out.println(output); // --> "string with double spaces"
 */
public class Solution4Day {

    // 방법 1
    public static String convertDoubleSpaceToSingle(String str) {

        String[] arr = str.split("  ");
        String join = String.join(" ", arr);
        
        return join;
    }

    public static void main(String[] args) {
        String output = convertDoubleSpaceToSingle("string  with  double  spaces");
        System.out.println(output); // --> "string with double spaces"
    }
}