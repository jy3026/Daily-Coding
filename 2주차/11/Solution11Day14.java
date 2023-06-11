//접미사인지 확인하기

public class Solution11Day14 {
    public static int solution(String my_string, String is_suffix) {

        for(int i=0;i<my_string.length();i++){
            if(is_suffix.equals(my_string.substring(i))) return 1;
        }
        return 0;
    }
    public static void main(String[] args) {

        int output = solution("banana","ana");
        System.out.println(output);
    }
}
