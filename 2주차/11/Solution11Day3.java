import java.util.*;

//콜라츠 수열 만들기
public class Solution11Day3 {
    public static int[] solution(int n) {
        List<Integer> arr = new ArrayList<>();
        arr.add(n);

        while(n>1){
            if(n%2 == 0) n = n/2;
            else n = 3* n+ 1;

            arr.add(n);
        }

        int[] result = new int[arr.size()];

        for(int i=0;i<result.length;i++){
            result[i] = arr.get(i);
        }

        return result;
    }
    public static void main(String[] args) {

        int[] output = solution(10);
        System.out.println(output);
    }
}
