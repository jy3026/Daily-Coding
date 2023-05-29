//문자열을 입력받아 문자열을 구성하는 각 단어의 첫 글자가 대문자인 문자열을 리턴해야 합니다.

/*
입출력 예시
String output1 = letterCapitalize('hello world');
System.out.println(output1); // "Hello World"
String output2 = letterCapitalize('java  is good');
System.out.println(output2); // "Java  Is Good"
 */
public class Solution2Day3 {

    // 방법 1
    public static String letterCapitalize1(String str) {
        // 공백만 입력 받았을경우, 빈 문자열일 경우
        if(str.length() == 0 || str.trim().isEmpty()) return "";

        char[] result = new char[str.length()];
        String output = "";

        // 문자열을 하나씩 쪼개 배열에 저장
        for(int i = 0;i<result.length;i++){
            result[i] = str.charAt(i);
        }
        //첫번째 문자는 대문자
        result[0] = Character.toUpperCase(result[0]);

        //공백 다음은 대문자로 치환
        for(int i=0;i<result.length;i++){
            if(result[i] == ' '){
                result[i+1] = Character.toUpperCase(result[i+1]);
            }
        }

        //배열 더해주기
        for(int i=0;i<result.length;i++){

            output += result[i];
        }

        return output;
    }

    // 방법 2
    public static String letterCapitalize2(String str) {
        // 빈 문자일 경우 빈 문자열 리턴
        if(str.length() == 0) return "";

        // 띄어쓰기로 쪼갠다
        String[] words = str.split(" ");
        String result = "";

        for(int i = 0; i < words.length; i++) {
            // 공백일경우 그대로 유지
            if(words[i].isEmpty()) {
                words[i] = words[i];
            }   // 그렇지 않으면 단어의 첫 글자를 대문자로 변환하고 나머지부분 그대로 유지
            else {
                words[i] = String.valueOf(words[i].charAt(0)).toUpperCase() + words[i].substring(1);
            }
        }
        // words 배열의 단어들을 공백으로 연결하여 하나의 문자열로 만듦
        result = String.join(" ", words);
        return result;
    }

    public static void main(String[] args) {
        String output = letterCapitalize1("java  is good");
        System.out.println(output); // "Hello World"
    }
}