//정수 배열 array와 정수 n이 매개변수로 주어질 때, array에 들어있는 정수 중 n과 가장 가까운 수를 return 하도록 solution 함수를 완성해주세요.
import java.util.*;

public class Solution14Day {

    // 내가 푼 방법
    public static int solution(int[] array, int n) {
        int[] arrs = new int[array.length];
        int solution = 0;

        for(int i=0;i<array.length;i++){
            arrs[i] = Math.abs(n - array[i]);
        }

        int result = arrs[0];

        for(int arr : arrs){
            if(arr<=result) {
                result=arr;
            }
        }

        Arrays.sort(array);

        for(int i=0;i<array.length;i++){
            if(result == Math.abs(n - array[i])){
                return array[i];
            }
        }

        return result;
    }

    // 쉬운 방법
    public int solution2(int[] array, int n) {
        int answer = 0;
        Arrays.sort(array);
        for(int i = 1 ; i < array.length ; i++){
            if(Math.abs(n-array[0]) > Math.abs(n-array[i])){
                array[0] = array[i];
            }
        }
        answer = array[0];
        return answer;
    }
    
    public static void main(String[] args) {

        int output = solution(new int[]{3,10,15},18);
        System.out.println(output);
    }
}
