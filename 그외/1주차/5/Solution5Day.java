//문자열을 입력받아 문자열 내에 아래 중 하나가 존재하는지 여부를 리턴해야 합니다.
//
//'a'로 시작해서 'b'로 끝나는 길이 5의 문자열
//'b'로 시작해서 'a'로 끝나는 길이 5의 문자열

/*
입출력 예시
boolean output = ABCheck("lane Borrowed");
System.out.println(output); // --> true
 */
public class Solution5Day {

    // 방법 1 ( 내가 푼 방법 )
    public static boolean ABCheck1(String str) {
        char[] arr = new char[str.length()];

        for(int i=0;i<str.length();i++){
            arr[i] = str.charAt(i);
        }

        for(int i=0;i<arr.length-4;i++){
            if(arr[i] == 'a' || arr[i] == 'A'){
                if(arr[i+4] == 'b' || arr[i+4] == 'B'){
                    return true;
                }
            }else if(arr[i] == 'b' || arr[i] == 'B'){
                if(arr[i+4] == 'a' || arr[i+4] == 'A'){
                    return true;
                }
            }
        }

        return false;
    }

    // 방법 2 정석
    public static boolean ABCheck2(String str) {
        if(str.length() == 0) {
            return false;
        }
        str = str.toLowerCase();

        for(int i = 4; i < str.length(); i++) {
            if((str.charAt(i) == 'a' && str.charAt(i - 4) == 'b') || (str.charAt(i) == 'b' && str.charAt(i - 4) == 'a')) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        boolean output = ABCheck1("lane Borrowed");
        System.out.println(output); // --> true
    }
}