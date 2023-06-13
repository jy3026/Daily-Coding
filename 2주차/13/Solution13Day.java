//문자열 my_string이 매개변수로 주어질 때, my_string 안에 있는 숫자만 골라 오름차순 정렬한 리스트를 return 하도록 solution 함수를 작성해보세요.
import java.util.*;

public class Solution13Day {
    public static int[] solution(String my_string) {
        List<Integer> list = new ArrayList<>();

        char[] arrs = my_string.toCharArray();

        for(char arr : arrs){
            if(arr-'0' >=0 && arr-'0' < 10) list.add(arr-'0');
        }

        int[] answer = list.stream().mapToInt(i->i).toArray();

        Arrays.sort(answer);

        return answer;
    }

    public static void main(String[] args) {

        int[] output = solution("a8por1e5mp4rs");
        System.out.println(output);
    }
}
