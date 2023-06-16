//문자열을 요소로 갖는 배열을 입력받아 가장 짧은 문자열과 가장 긴 문자열을 제거한 배열을 리턴해야 합니다.

import java.util.Arrays;

/*
입출력 예시
String[] output = removeExtremes(new String[]{"a", "b", "c", "def"});
System.out.println(output); // --> ["a"', "b"]

output = removeExtremes(new String[]{"where", "is", "the", "longest", "word"});
System.out.println(output); // --> ["where", "the", "word"]
 */
public class Solution7Day {

    // 방법 1
    public static String[] removeExtremes(String[] arr) {
        if(arr.length == 0) {
            return null;
        }

        // 최대 길이는 20, 최소 길이는 0으로 기본값을 설정.
        //가장 작은 인덱스와 가장 긴 문자열의 인덱스를 찾기위해 0으로 기본값을 설정.
        int shortestLen = 20;
        int longestLen = 0;
        int shortestIdx = 0;
        int longestIdx = 0;

        for(int i=0; i<arr.length;i++){
            if(arr[i].length() >= longestLen){
                longestLen = arr[i].length();
                longestIdx = i;
            }
            if (arr[i].length() <= shortestLen) {
                shortestLen = arr[i].length();
                shortestIdx = i;
            }
        }

        String[] result = new String[arr.length - 2];
        int curIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            if (i != shortestIdx && i != longestIdx) {
                result[curIndex] = arr[i];
                curIndex++;
            }
        }

        return result;
    }


    public static void main(String[] args) {
        String[] output = removeExtremes(new String[]{"a", "b", "c", "def"});
        System.out.println(Arrays.toString(output)); // --> ["a"', "b"]
    }
}