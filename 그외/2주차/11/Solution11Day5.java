//간단한 논리 연산
public class Solution11Day5 {
    public static boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        return (x1 || x2) && ( x3 || x4);
    }
    public static void main(String[] args) {

        boolean output = solution(false,true,true,true);
        System.out.println(output);
    }
}
