//접두사인지 확인하기
public class Solution12Day {
    public static int solution(String my_string, String is_prefix) {
        int answer = 0;

        for(int i=0;i<my_string.length();i++){
            if(is_prefix.equals(my_string.substring(0,i))){
                answer = 1;
            }
        }

        return answer;
    }
    public static void main(String[] args) {

        int output = solution("banana","ban");
        System.out.println(output);
    }
}
