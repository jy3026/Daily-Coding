//배열 만들기 1
import java.util.*;

public class Solution12Day6 {
    public static int[] solution(int n, int k) {
        List<Integer> list = new ArrayList<>();

        for(int i=k;i<=n;i+=k){
            list.add(i);
        }

        int[] arr = new int[list.size()];

        for(int i=0;i<arr.length;i++){
            arr[i] = list.get(i);
        }

        return arr;
    }
    public static void main(String[] args) {

        int[] output = solution(10,3);
        System.out.println(output);
    }
}
