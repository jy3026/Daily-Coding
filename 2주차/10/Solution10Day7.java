//수 조작하기 1
public class Solution10Day7 {
    public static int solution(int n, String control) {
        int answer = n;

        String[] arr = control.split("");

        for(int i=0;i<arr.length;i++){
            switch (arr[i]) {
                case "w":
                    answer += 1;
                    break;
                case "s":
                    answer -= 1;
                    break;
                case "d":
                    answer += 10;
                    break;
                case "a":
                    answer -= 10;
                    break;
            }
        }
        return answer;
    }
    public static void main(String[] args) {

        int output = solution(0,"wsdawsdassw");
        System.out.println(output);
    }
}
