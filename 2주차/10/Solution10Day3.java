//주사위 게임 2
public class Solution10Day3 {
    public static int solution(int a, int b, int c) {
        if(a != b && a != c && b != c) return a+b+c;
        else if(a==b && a==c && b==c)
            return (int)((a+b+c) * (Math.pow(a,2)+ Math.pow(b,2) + Math.pow(c,2)) * (Math.pow(a,3)+ Math.pow(b,3) + Math.pow(c,3)));

        return (int)((a+b+c) * (Math.pow(a,2)+ Math.pow(b,2) + Math.pow(c,2)));
    }
    public static void main(String[] args) {

        int output = solution(4,4,4);
        System.out.println(output);
    }
}
