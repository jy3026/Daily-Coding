//문자열을 입력받아 연속된 한자리 홀수 숫자 사이에 '-'를 추가한 문자열을 리턴해야 합니다.

/*
입출력 예시
String output = insertDash("454793");
System.out.println(output); // --> 4547-9-3
 */
public class Solution6Day {

    // 방법 1 (내가 푼 방법)
    public static String insertDash1(String str) {
        if(str.length() == 0) return null;

        char[] arr = new char[str.length()];
        String result = "";

        for(int i =0;i<str.length();i++){
            arr[i] = str.charAt(i);
        }

        for(int i=0;i<arr.length;i++){
            if(arr[i] % 2 == 1){
                if(arr[i-1] % 2 ==1){
                    result += "-";
                }
            }
            result += arr[i];
        }

        return result;
    }

    // 방법 2
    public static String insertDash2(String str) {
        if(str.length() == 0) {
            return null;
        }
        String result = "" + str.charAt(0);

        for(int i = 1; i < str.length(); i++) {
            int preNumber = Character.getNumericValue(str.charAt(i - 1)) % 2;
            int curNumber = Character.getNumericValue(str.charAt(i)) % 2;
            if(preNumber != 0 && curNumber != 0) {
                result = result + "-";
            }
            result = result + str.charAt(i);
        }
        return result;
    }


    public static void main(String[] args) {
        String output = insertDash1("454793");
        System.out.println(output); // --> 4547-9-3
    }
}