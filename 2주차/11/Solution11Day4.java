import java.util.*;

//배열 만들기 4
public class Solution11Day4 {
    public static int[] solution(int[] arr) {
        List<Integer> arrList = new ArrayList<>();

        int i =0;

        while(i < arr.length){
            if(arrList.size() == 0) {
                arrList.add(arr[i]);
                i++;
            }else if(arrList.get(arrList.size()-1) < arr[i]){
                arrList.add(arr[i]);
                i++;
            }else if(arrList.get(arrList.size()-1) >= arr[i]){
                arrList.remove(arrList.size()-1);
            }

        }

        int[] stk = new int[arrList.size()];

        for(int j=0;j<stk.length;j++){
            stk[j] = arrList.get(j);
        }


        return stk;
    }
    public static void main(String[] args) {

        int[] output = solution(new int[]{1, 4, 2, 5, 3});
        System.out.println(output);
    }
}
