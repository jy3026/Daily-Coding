//이어 붙인 수
public class Solution10Day5 {
    public static int solution(int[] num_list) {
        String odd="";
        String even="";

        for(int i=0; i<num_list.length;i++){
            if(num_list[i] % 2 == 1) odd += Integer.toString(num_list[i]);
            else even += Integer.toString(num_list[i]);
        }

        return Integer.parseInt(odd) + Integer.parseInt(even);
    }
    public static void main(String[] args) {

        int output = solution(new int[]{3, 4, 5, 2, 1});
        System.out.println(output);
    }
}
