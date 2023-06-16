import java.util.Arrays;

//수열과 구간 쿼리 3
public class Solution10Day9 {
    public static int[] solution(int[] arr, int[][] queries) {
        int[] answer = Arrays.copyOf(arr,arr.length);

        for(int i=0;i<queries.length;i++){
            int temp = queries[i][0];
            int temp2 = queries[i][1];
            int temp3 = answer[temp];
            int temp4 = answer[temp2];

            answer[temp] = temp4;
            answer[temp2] = temp3;
        }
        return answer;
    }
    public static void main(String[] args) {

        int[] output = solution(new int[]{0, 1, 0, 10, 0, 1, 0, 10, 0, -1, -2, -1}, new int[][]{{0, 3},{1, 2},{1, 4}});
        System.out.println(output);
    }
}
