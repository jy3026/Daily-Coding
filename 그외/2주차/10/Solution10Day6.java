import java.util.Arrays;

//마지막 두 원소
public class Solution10Day6 {
    public static int[] solution(int[] num_list) {

        int[] answer = Arrays.copyOf(num_list, num_list.length + 1);
        int beforelast = num_list[num_list.length - 2];
        int last = num_list[num_list.length-1];

        if(beforelast >= last){
            answer[answer.length - 1] = last * 2;
        }
        else{
            answer[answer.length - 1] = last - beforelast;
        }

        return answer;
    }
    public static void main(String[] args) {

        int[] output = solution(new int[]{3, 4, 5, 2, 1});
        System.out.println(output);
    }
}
