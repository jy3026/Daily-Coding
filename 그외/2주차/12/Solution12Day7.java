//글자 지우기
import java.util.*;

public class Solution12Day7 {
    public static String solution(String my_string, int[] indices) {
        StringBuilder answer = new StringBuilder();

        List<Integer> list = new ArrayList<>();
        for (int index : indices) {
            list.add(index);
        }

        for (int i = 0; i < my_string.length(); i++) {
            if (!list.contains(i)) {
                answer.append(my_string.charAt(i));
            }
        }

        return answer.toString();
    }
    public static void main(String[] args) {

        String output = solution("apporoograpemmemprs",new int[]{1, 16, 6, 15, 0, 10, 11, 3});
        System.out.println(output);
    }
}
