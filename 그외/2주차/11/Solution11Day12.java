//문자열의 뒤의 n글자

public class Solution11Day12 {
    public static String solution(String my_string, int n) {

        return my_string.substring((my_string.length()-n));

    }
    public static void main(String[] args) {

        String output = solution("ProgrammerS123"	,11);
        System.out.println(output);
    }
}
