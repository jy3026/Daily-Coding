//세로 읽기
import java.util.*;
public class Solution12Day3 {
    public static String solution(String my_string, int m, int c) {
        String answer = "";
        List<String> list = new ArrayList<>();

        String[] arrs = my_string.split("");

        for (String arr : arrs) {
            list.add(arr);
        }

        for (int i = c - 1; i < list.size(); i += m) {
            answer += list.get(i);
        }

        return answer;
    }
    public static void main(String[] args) {

        String output = solution("banana",2,3);
        System.out.println(output);
    }
}
