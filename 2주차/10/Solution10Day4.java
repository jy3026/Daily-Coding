//원소들의 곱과 합
public class Solution10Day4 {
    public static int solution(int[] num_list) {
        int plus = 0;
        int multi = 1;

        for(int i =0; i<num_list.length;i++){
            plus += num_list[i];
            multi *= num_list[i];
        }

        if(Math.pow(plus,2) > multi) return 1;
        else return 0;

    }
    public static void main(String[] args) {

        int output = solution(new int[]{3, 4, 5, 2, 1});
        System.out.println(output);
    }
}
