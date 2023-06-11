//접미사 배열
import java.util.*;
public class Solution11Day13 {
    public static String[] solution(String my_string) {
        List<String> arr = new ArrayList<>();

        for(int i=0;i<my_string.length();i++){
            arr.add(my_string.substring(i));
        }

        String[] answer = new String[arr.size()];

        for(int i=0;i<answer.length;i++)
        {
            answer[i] = arr.get(i);
        }

        Arrays.sort(answer);

        return answer;
    }
    public static void main(String[] args) {

        String[] output = solution("ProgrammerS123");
        System.out.println(output);
    }
}
