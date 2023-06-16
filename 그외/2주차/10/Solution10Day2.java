//등차수열의 특정한 항만 더하기
public class Solution10Day2 {
    public static int solution(int a, int d, boolean[] included) {
        int result = 0;


        for(int i =0; i<included.length;i++){
            if(i >= 1) a=a+d;

            if(included[i] == true){
                result += a;
            }
        }

        return result;
    }
    public static void main(String[] args) {

        int output = solution(3,4, new boolean[]{true, false, false, true, true});
        System.out.println(output);
    }
}
