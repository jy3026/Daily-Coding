import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int count = 0;
        for(int[] command : commands){
            int[] num = Arrays.copyOfRange(array,command[0]-1,command[1]);
            Arrays.sort(num);
            // System.out.println(Arrays.toString(num));
            // System.out.println(num[command[2]-1]);
            answer[count] = num[command[2]-1];
            count++;
        }
        return answer;
    }
}