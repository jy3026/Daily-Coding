//9로 나눈 나머지

public class Solution11Day8 {
    public static int solution(String number) {
        int result = 0;
        String[] nums = number.split("");

        for(String num : nums){
            result += Integer.parseInt(num);
        }

        return result % 9;

    }
    public static void main(String[] args) {

        int output = solution("123");
        System.out.println(output);
    }
}
