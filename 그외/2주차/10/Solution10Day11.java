//수열과 구간 쿼리 4
public class Solution10Day11 {
    public static int[] solution(int[] arr, int[][] queries) {
        int num = 0;

        for(int[] queire : queries){
            int s = queire[0];
            int e = queire[1];
            int k = queire[2];

            for(int i=s ; i<=e; i++){
                if(i % k == 0){
                    arr[i] += 1;
                }

            }
        }

        return arr;
    }
    public static void main(String[] args) {

        int[] output = solution(new int[]{0, 1, 0, 10, 0, 1, 0, 10, 0, -1, -2, -1}, new int[][]{{0, 3},{1, 2},{1, 4}});
        System.out.println(output);
    }
}
