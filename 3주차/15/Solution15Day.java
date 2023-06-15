//소인수분해
import java.util.*;

public class Solution15Day {

    // 내가 푼 방법
    public static int[] solution(int n) {
        List<Integer> list = new ArrayList<>();

        for(int i=2 ; i<=n;i++){
            while(n%i == 0){
                if(!list.contains(i)) list.add(i);
                n /= i;
            }
        }

        int[] arrs = new int[list.size()];

        for(int i=0; i<arrs.length;i++){
            arrs[i] = list.get(i);
        }


        return arrs;
    }

    public static void main(String[] args) {

        int[] output = solution(420);
        System.out.println(output);
    }
}
