//수열과 구간 쿼리 2
public class Solution10Day10 {
    public static int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        int num = 0;

        for(int[] querie : queries){
            int s = querie[0];
            int e = querie[1];
            int k = querie[2];
            int small = Integer.MAX_VALUE;
            for(int i =s;i<=e;i++){
                if(k<arr[i] && small > arr[i]){
                    small = arr[i];

                }
            }

            if(small == Integer.MAX_VALUE){
                small = -1;
            }
            answer[num++] = small;
        }

        return answer;
    }
    public static void main(String[] args) {

        int[] output = solution(new int[]{0, 1, 0, 10, 0, 1, 0, 10, 0, -1, -2, -1}, new int[][]{{0, 3},{1, 2},{1, 4}});
        System.out.println(output);
    }
}
