import java.util.*;

//카운트 업
public class Solution11Day2 {
    public static int[] solution(int start, int end) {
        ArrayList<Integer> arr = new ArrayList<>();

        for(int i=start;i<=end;i++){
            arr.add(i);
        }

        int[] result = new int[arr.size()];

        for(int i=0;i<result.length;i++){
            result[i] = arr.get(i);
        }


        return result;
    }
    public static void main(String[] args) {

        int[] output = solution(3,10);
        System.out.println(output);
    }
}
